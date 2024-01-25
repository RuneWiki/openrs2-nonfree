import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static87 {

	@OriginalMember(owner = "client!ee", name = "e", descriptor = "I")
	public static int anInt5504;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "Lclient!dq;")
	public static final Class60 aClass60_13 = new Class60(5, -1);

	@OriginalMember(owner = "client!ee", name = "c", descriptor = "Ljava/lang/String;")
	public static String aString67 = null;

	@OriginalMember(owner = "client!ee", name = "d", descriptor = "Lclient!vp;")
	public static final Class254 aClass254_110 = new Class254(20, 4);

	@OriginalMember(owner = "client!ee", name = "f", descriptor = "[I")
	public static final int[] anIntArray412 = new int[64];

	@OriginalMember(owner = "client!ee", name = "g", descriptor = "I")
	public static int anInt5505 = 0;

	@OriginalMember(owner = "client!ee", name = "a", descriptor = "(III)Z")
	public static boolean method4373(@OriginalArg(1) int arg0, @OriginalArg(2) int arg1) {
		return Static276.method3833(arg0, arg1) | (arg1 & 0x40000) != 0 || Static153.method3783(arg1, arg0);
	}

	@OriginalMember(owner = "client!ee", name = "b", descriptor = "(III)Z")
	public static boolean method4374(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static397.anInt7107; local1++) {
			@Pc(6) Class41 local6 = Static201.aClass41Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt747 == 1) {
				local15 = local6.anInt757 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt763 + (local6.anInt759 * local15 >> 8);
					local37 = local6.anInt755 + (local6.anInt756 * local15 >> 8);
					local47 = local6.anInt766 + (local6.anInt751 * local15 >> 8);
					local57 = local6.anInt761 + (local6.anInt767 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt747 == 2) {
				local15 = arg0 - local6.anInt757;
				if (local15 > 0) {
					local27 = local6.anInt763 + (local6.anInt759 * local15 >> 8);
					local37 = local6.anInt755 + (local6.anInt756 * local15 >> 8);
					local47 = local6.anInt766 + (local6.anInt751 * local15 >> 8);
					local57 = local6.anInt761 + (local6.anInt767 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt747 == 3) {
				local15 = local6.anInt763 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt750 * local15 >> 8);
					local37 = local6.anInt765 + (local6.anInt748 * local15 >> 8);
					local47 = local6.anInt766 + (local6.anInt751 * local15 >> 8);
					local57 = local6.anInt761 + (local6.anInt767 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt747 == 4) {
				local15 = arg2 - local6.anInt763;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt750 * local15 >> 8);
					local37 = local6.anInt765 + (local6.anInt748 * local15 >> 8);
					local47 = local6.anInt766 + (local6.anInt751 * local15 >> 8);
					local57 = local6.anInt761 + (local6.anInt767 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt747 == 5) {
				local15 = arg1 - local6.anInt766;
				if (local15 > 0) {
					local27 = local6.anInt757 + (local6.anInt750 * local15 >> 8);
					local37 = local6.anInt765 + (local6.anInt748 * local15 >> 8);
					local47 = local6.anInt763 + (local6.anInt759 * local15 >> 8);
					local57 = local6.anInt755 + (local6.anInt756 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
