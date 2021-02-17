public String frontTimes(String str, int n) {
  String result = "";
  String strpart = "";
  if (str.length() > 3) {
    strpart = str.substring(0,3);
  }
  else {
    strpart = str;
  }
  for (int i=0; i<n; i++) {
    result = result + strpart;
  }
  return result;
}