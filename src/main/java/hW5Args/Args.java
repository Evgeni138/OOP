package hW5Args;

public class Args {
    private int arg1;
    private String arg2;
    private double arg3;
    private int arg4;
    private String arg5;
    private int arg6;

    private String arg7;

    public static class Builder {
        int arg1;
        String arg2;
        double arg3;
        int arg4;
        String arg5;
        int arg6;
        String arg7;

        public Builder(int arg1) {
            this.arg1 = arg1;
        }

        public Builder setArg2(String arg2) {
            this.arg2 = arg2;
            return this;
        }

        public Builder setArg3(double arg3) {
            this.arg3 = arg3;
            return this;
        }

        public Builder setArg4(int arg4) {
            this.arg4 = arg4;
            return this;
        }

        public Builder setArg5(String arg5) {
            this.arg5 = arg5;
            return this;
        }

        public Builder setArg6(int arg6) {
            this.arg6 = arg6;
            return this;
        }

        public Builder setArg7(String arg7) {
            this.arg7 = arg7;
            return this;
        }

        public Args build() {
            return new Args(this);
        }

    }
    Args(Builder builder) {
        arg1 = builder.arg1;
        arg2 = builder.arg2;
        arg3 = builder.arg3;
        arg4 = builder.arg4;
        arg5 = builder.arg5;
        arg6 = builder.arg6;
        arg7 = builder.arg7;
    }

    @Override
    public String toString() {
        return "Args{" +
                "arg1=" + arg1 +
                ", arg2='" + arg2 + '\'' +
                ", arg3=" + arg3 +
                ", arg4=" + arg4 +
                ", arg5='" + arg5 + '\'' +
                ", arg6=" + arg6 +
                ", arg7='" + arg7 + '\'' +
                '}';
    }
}