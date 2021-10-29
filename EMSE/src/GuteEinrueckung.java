public class GuteEinrueckung {
    static private int d;
    static private int f;
    static private int depth;
    static private int numberOfBlocks;
    static private int result=0;
    public GuteEinrueckung(int a, int b, int tiefe, int noOfBlocks){
        this.d=a;
        this.f=b;
        this.depth= tiefe;
        this.numberOfBlocks=noOfBlocks;
    }

    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        GuteEinrueckung.result = result;
    }

    public static int Rechnung(int d, int f, int k, int depth, int numberOfBlocks) {
        if (depth == 0) {
            if (k - 5 != 10) {
                d = d-k+f;
                if (result != f - d) {
                    k = 7;
                    if (d == f) {
                        result = result + d;
                    } else {
                        d = f - 7;
                    }
                    if (result + f == k) {
                        result = k - d;
                    } else {
                        result = (d + f) * 2;
                    }
                }
            }
            k=(d+3)-f;
            Main.a=d;
            Main.b=f;
            Main.k=k;
        }


        if (depth == 1) {
            if (d < k) {
                f = k - d;
                d = f + 6;
                if (f < 35) {
                    f = result - 2;
                    if (k < 150) {
                        result = result * 3;
                    } else {
                        result = (f * 3) ;
                    }
                    if (d == f) {
                        result = k - d;
                    } else {
                        result = (d + f) * 2;
                    }
                }
            }
            d -= 2;
            f -= 10;
            Main.a=d;
            Main.b=f;
            Main.k=k;
        }

        if (depth == 2) {
            if (f != 0) {
                f = d * 4;
                if (d / 4 < 67) {
                    result = (d - f)*2;
                    if (result < 150) {
                        result = f - 3;
                    } else {
                        d = (result-50) ;
                    }
                    if (result < 132) {
                        result = d * 2;
                    } else {
                        result =k+5;
                    }
                }
            }
            k+= 5;
            f = f + 7;
            Main.a=d;
            Main.b=f;
            Main.k=k;
        }

        if (depth == 3) {
            if (result < 350) {
                result = k;
                if (d - f != 90) {
                    k = k - 9;
                    if (k > 50) {
                        f = f - 3;
                    } else {
                        result = d - k;
                    }
                    if (d < 25) {
                        result = d * f;
                    } else {
                        result = k -2;
                    }
                }
            }
            d = k - 4;
            k += 2;
            Main.a=d;
            Main.b=f;
            Main.k=k;
        }

        if (depth == 4) {
            if (d < 100) {
                result -= 2;
                if (f < 35) {
                    result = k-10+f-d;
                    if (result < 150) {
                        result = result * 3;
                    } else {
                        result =result+10;
                    }
                    if (result < 500) {
                        result = d * f;
                    } else {
                        result = d;
                    }
                }
            }
            d -= 5;
            f -= 10;
            Main.a=d;
            Main.b=f;
            Main.k=k;
        }

        return result;
    }


    public static void PrintMitEinrueckung(int depth,int numberOfBlocks) {
        if (depth == 0) {
            System.out.println("if (k - 5 != 10) {\n" +
                    "    d = d-k+f;\n" +
                    "    if (result != f - d) {\n" +
                    "        k = 7;\n" +
                    "        if (d == f) {\n" +
                    "            result = result + d;\n" +
                    "        } else {\n" +
                    "            d = f - 7;\n" +
                    "        }\n" +
                    "        if (result + f == k) {\n" +
                    "            result = k - d;\n" +
                    "        } else {\n" +
                    "            result = (d + f) * 2;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "k=(d+3)-f;"
            );
        }
        if (depth == 1) {
            System.out.println("if (d < k) {\n" +
                    "    f = k - d;\n" +
                    "    d = f + 6;\n" +
                    "    if (f < 35) {\n" +
                    "        f = result - 2;\n" +
                    "        if (k < 150) {\n" +
                    "            result = result * 3;\n" +
                    "        } else {\n" +
                    "            result = (f * 3);\n" +
                    "        }\n" +
                    "        if (d == f) {\n" +
                    "            result = k - d;\n" +
                    "        } else {\n" +
                    "            result = (d + f) * 2;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "d -= 2;\n" +
                    "f -= 10;"
            );
        }
        if (depth == 2) {
            System.out.println("if (f != 0) {\n" +
                    "    f = d * 4;\n" +
                    "    if (d / 4 < 67) {\n" +
                    "        result = (d - f)*2;\n" +
                    "        if (result < 150) {\n" +
                    "            result = f - 3;\n" +
                    "        } else {\n" +
                    "            d =result-50;\n" +
                    "        }\n" +
                    "        if (result < 132) {\n" +
                    "            result = d * 2;\n" +
                    "        } else {\n" +
                    "            result = k+5;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "k+= 5;\n" +
                    "f = f + 7;"
            );
        }
        if (depth == 3) {
            System.out.println("if (result < 350) {\n" +
                    "    result = k;\n" +
                    "    if (d - f != 90) {\n" +
                    "        k = k - 9;\n" +
                    "        if (k > 50) {\n" +
                    "            f = f - 3;\n" +
                    "        } else {\n" +
                    "            result = d - k;\n" +
                    "        }\n" +
                    "        if (d < 25) {\n" +
                    "            result = d * f;\n" +
                    "        } else {\n" +
                    "            result = k -2;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "d = k - 4;\n" +
                    "k += 2;"
            );
        }
        if (depth == 4) {
            System.out.println("if (d < 100) {\n" +
                    "    result -= 2;\n" +
                    "    if (f < 35) {\n" +
                    "        result = k-10+f-d;\n" +
                    "        if (result < 150) {\n" +
                    "            result = result * 3;\n" +
                    "        } else {\n" +
                    "            result =result+10;\n" +
                    "        }\n" +
                    "        if (result < 500) {\n" +
                    "            result = d * f;\n" +
                    "        } else {\n" +
                    "            result = d;\n" +
                    "        }\n" +
                    "    }\n" +
                    "}\n" +
                    "d -= 5;\n" +
                    "f -= 10;"
            );

        }
    }
    public static void PrintOhneEinrueckung(int depth,int numberOfBlocks){
        if (depth == 0) {
            System.out.println("if (k - 5 != 10) {\n" +
                    "d = d-k+f;\n" +
                    "if (result != f - d) {\n" +
                    "k = 7;\n" +
                    "if (d == f) {\n" +
                    "result = result + d;\n" +
                    "} else {\n" +
                    "d = f - 7;\n" +
                    "}\n" +
                    "if (result + f == k) {\n" +
                    "result = k - d;\n" +
                    "} else {\n" +
                    "result = (d + f) * 2;\n" +
                    "}\n" +
                    "}\n" +
                    "}\n" +
                    "k=(d+3)-f;"
            );
        }
        if (depth == 1) {
            System.out.println("if (d < k) {\n" +
                    "f = k - d;\n" +
                    "d = f + 6;\n" +
                    "if (f < 35) {\n" +
                    "f = result - 2;\n" +
                    "if (k < 150) {\n" +
                    "result = result * 3;\n" +
                    "} else {\n" +
                    "result = (f * 3);\n" +
                    "}\n" +
                    "if (d == f) {\n" +
                    "result = k - d;\n" +
                    "} else {\n" +
                    "result = (d + f) * 2;\n" +
                    "}\n" +
                    "}\n" +
                    "}\n" +
                    "d -= 2;\n" +
                    "f -= 10;"
            );
        }
        if (depth == 2) {
            System.out.println("if (f != 0) {\n" +
                    "f = d * 4;\n" +
                    "if (d / 4 < 67) {\n" +
                    "result = (d - f)*2;\n" +
                    "if (result < 150) {\n" +
                    "result = f - 3;\n" +
                    "} else {\n" +
                    "d = result-50;\n" +
                    "}\n" +
                    "if (result < 132) {\n" +
                    "result = d * 2;\n" +
                    "} else {\n" +
                    "result = k+5;\n" +
                    "}\n" +
                    "}\n" +
                    "}\n" +
                    "k+= 5;\n" +
                    "f = f + 7;"
            );
        }
        if (depth == 3) {
            System.out.println("if (result < 350) {\n" +
                    "result = k;\n" +
                    "if (d - f != 90) {\n" +
                    "k = k - 9;\n" +
                    "if (k > 50) {\n" +
                    "f = f - 3;\n" +
                    "} else {\n" +
                    "result = d - k;\n" +
                    "}\n" +
                    "if (d < 25) {\n" +
                    "result = d * f;\n" +
                    "} else {\n" +
                    "result = k -2;\n" +
                    "}\n" +
                    "}\n" +
                    "}\n" +
                    "d = k - 4;\n" +
                    "k += 2;"
            );
        }
        if (depth == 4) {
            System.out.println("if (d < 100) {\n" +
                    "result -= 2;\n" +
                    "if (f < 35) {\n" +
                    "result = k-10+f-d;\n" +
                    "if (result < 150) {\n" +
                    "result = result * 3;\n" +
                    "} else {\n" +
                    "result =result+10;\n" +
                    "}\n" +
                    "if (result < 500) {\n" +
                    "result = d * f;\n" +
                    "} else {\n" +
                    "result = d;\n" +
                    "}\n" +
                    "}\n" +
                    "}\n" +
                    "d -= 5;\n" +
                    "f -= 10;"
            );
        }
    }
}
