  String line;
        String pidInfo = "";
        try {
            Process p = Runtime.getRuntime().exec(System.getenv("windir") + "\\system32\\" + "tasklist.exe");
            BufferedReader input = new BufferedReader(new InputStreamReader(p.getInputStream()));
            while ((line = input.readLine()) != null) {
                pidInfo += line;
            }
            input.close();

            if (pidInfo.contains("xampp-control")) {
               //TODO
            }
        } catch (IOException e) {

        }
