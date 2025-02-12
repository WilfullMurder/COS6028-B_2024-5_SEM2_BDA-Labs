package org.WilfullMurder.lab4;

public class TriangleType
{
   /**
     * @param s1, s2, s3:  sides of the putative triangle
     * @return String describing type of triangle
     */
   public static String triangle (int s1, int s2, int s3)
   {
      // Reject non-positive sides
      if (s1 <= 0 || s2 <= 0 || s3 <= 0)
         return "INVALID";

      // Check triangle inequality
      if (s1+s2 <= s3 || s2+s3 <= s1 || s1+s3 <= s2)
         return "INVALID";

      // Identify equilateral triangles
      if ((s1 == s2) && (s2 == s3))
         return "EQUILATERAL";

      // Identify isosceles triangles
      if ((s1 == s2) || (s2 == s3) || (s1 == s3))
         return "ISOSCELES";

      return "SCALENE";
   }
   
}
