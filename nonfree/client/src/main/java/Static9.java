import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "tb", descriptor = "[Lclient!cg;")
	public static Class1_Sub2_Sub5_Sub1[] aClass1_Sub2_Sub5_Sub1Array1;

	@OriginalMember(owner = "client!ah", name = "hb", descriptor = "I")
	public static int anInt236 = 0;

	@OriginalMember(owner = "client!ah", name = "jb", descriptor = "[I")
	public static final int[] anIntArray16 = new int[200];

	@OriginalMember(owner = "client!ah", name = "pb", descriptor = "Lclient!oc;")
	private static final Class65 aClass65_121 = Static118.method2249("Discard");

	@OriginalMember(owner = "client!ah", name = "kb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_118 = aClass65_121;

	@OriginalMember(owner = "client!ah", name = "mb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_119 = Static118.method2249("60 Sekunden noch einmal)3)3)3");

	@OriginalMember(owner = "client!ah", name = "nb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_120 = Static118.method2249("T");

	@OriginalMember(owner = "client!ah", name = "qb", descriptor = "Lclient!oc;")
	public static final Class65 aClass65_122 = Static118.method2249("Das ist eine Mitglieder)2Welt(Q");

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!w;B)V")
	public static void method164(@OriginalArg(0) Class6_Sub4 arg0) {
		if (arg0.anInt3984 == Static174.anInt3887 || arg0.anInt3945 == -1 || arg0.anInt3956 != 0 || arg0.anInt3970 + 1 > Static173.method2924(arg0.anInt3945).anIntArray282[arg0.anInt3968]) {
			@Pc(31) int local31 = arg0.anInt3984 - arg0.anInt3963;
			@Pc(37) int local37 = Static174.anInt3887 - arg0.anInt3963;
			@Pc(48) int local48 = arg0.anInt3947 * 128 + arg0.anInt3959 * 64;
			@Pc(58) int local58 = arg0.anInt3959 * 64 + arg0.anInt3952 * 128;
			@Pc(69) int local69 = arg0.anInt3958 * 128 + arg0.anInt3959 * 64;
			@Pc(79) int local79 = arg0.anInt3948 * 128 + arg0.anInt3959 * 64;
			arg0.anInt3976 = (local79 * local37 + (local31 - local37) * local48) / local31;
			arg0.anInt3934 = ((local31 - local37) * local69 + local37 * local58) / local31;
		}
		arg0.anInt3955 = 0;
		if (arg0.anInt3949 == 0) {
			arg0.anInt3965 = 1024;
		}
		if (arg0.anInt3949 == 1) {
			arg0.anInt3965 = 1536;
		}
		if (arg0.anInt3949 == 2) {
			arg0.anInt3965 = 0;
		}
		if (arg0.anInt3949 == 3) {
			arg0.anInt3965 = 512;
		}
		arg0.anInt3971 = arg0.anInt3965;
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(III)Z")
	public static boolean method165(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static207.anInt4404; local1++) {
			@Pc(6) Class73 local6 = Static83.aClass73Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt3479 == 1) {
				local15 = local6.anInt3463 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt3476 + (local6.anInt3468 * local15 >> 8);
					local37 = local6.anInt3473 + (local6.anInt3467 * local15 >> 8);
					local47 = local6.anInt3469 + (local6.anInt3480 * local15 >> 8);
					local57 = local6.anInt3484 + (local6.anInt3471 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3479 == 2) {
				local15 = arg0 - local6.anInt3463;
				if (local15 > 0) {
					local27 = local6.anInt3476 + (local6.anInt3468 * local15 >> 8);
					local37 = local6.anInt3473 + (local6.anInt3467 * local15 >> 8);
					local47 = local6.anInt3469 + (local6.anInt3480 * local15 >> 8);
					local57 = local6.anInt3484 + (local6.anInt3471 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3479 == 3) {
				local15 = local6.anInt3476 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt3463 + (local6.anInt3478 * local15 >> 8);
					local37 = local6.anInt3482 + (local6.anInt3470 * local15 >> 8);
					local47 = local6.anInt3469 + (local6.anInt3480 * local15 >> 8);
					local57 = local6.anInt3484 + (local6.anInt3471 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3479 == 4) {
				local15 = arg2 - local6.anInt3476;
				if (local15 > 0) {
					local27 = local6.anInt3463 + (local6.anInt3478 * local15 >> 8);
					local37 = local6.anInt3482 + (local6.anInt3470 * local15 >> 8);
					local47 = local6.anInt3469 + (local6.anInt3480 * local15 >> 8);
					local57 = local6.anInt3484 + (local6.anInt3471 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt3479 == 5) {
				local15 = arg1 - local6.anInt3469;
				if (local15 > 0) {
					local27 = local6.anInt3463 + (local6.anInt3478 * local15 >> 8);
					local37 = local6.anInt3482 + (local6.anInt3470 * local15 >> 8);
					local47 = local6.anInt3476 + (local6.anInt3468 * local15 >> 8);
					local57 = local6.anInt3473 + (local6.anInt3467 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}
}
