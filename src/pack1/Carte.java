package pack1;

public class Carte implements Comparable<Carte> {



    private String Titlu;
    private String Author;
    private int an_apaitie;
    private int nr_pagini;

    public Carte(String titlu, String author, int an_apaitie, int nr_pagini) {
        Titlu = titlu;
        Author = author;
        this.an_apaitie = an_apaitie;
        this.nr_pagini = nr_pagini;
    }

    @Override
    public int compareTo(Carte o) {
        if(this.nr_pagini<o.nr_pagini)
            return -1;
        if(this.nr_pagini>o.nr_pagini)
            return 1;
        if(this.nr_pagini==o.nr_pagini)
            return 0;
        return 0;

    }

    @Override

    public String toString()
    {
        //return super.toString();
        return this.Titlu+"scrisa de "+this.Author+" puvlicata in "+this.an_apaitie;
    }




}
