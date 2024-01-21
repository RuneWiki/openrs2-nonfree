import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static88 {

	@OriginalMember(owner = "client!kd", name = "r", descriptor = "Lclient!jc;")
	public static Class40 aClass40_26;

	@OriginalMember(owner = "client!kd", name = "B", descriptor = "Lclient!jc;")
	public static Class40 aClass40_27;

	@OriginalMember(owner = "client!kd", name = "w", descriptor = "Lclient!gg;")
	private static Class28 aClass28_1351 = Static107.method1838("Loading title screen )2 ");

	@OriginalMember(owner = "client!kd", name = "G", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1352 = Static107.method1838("Fallen lassen");

	@OriginalMember(owner = "client!kd", name = "H", descriptor = "Lclient!gg;")
	public static Class28 aClass28_1353 = aClass28_1351;

	@OriginalMember(owner = "client!kd", name = "I", descriptor = "I")
	public static int anInt2254 = 0;

	@OriginalMember(owner = "client!kd", name = "b", descriptor = "(I)V")
	public static void method1578() {
		aClass40_26 = null;
		aClass28_1351 = null;
		aClass28_1352 = null;
		aClass28_1353 = null;
		aClass40_27 = null;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(ZLjava/lang/Object;I)[B")
	public static byte[] method1579(@OriginalArg(0) boolean arg0, @OriginalArg(1) Object arg1) {
		if (arg1 == null) {
			return null;
		} else if (arg1 instanceof byte[]) {
			@Pc(13) byte[] local13 = (byte[]) arg1;
			return arg0 ? Static40.method722(local13) : local13;
		} else if (arg1 instanceof Class89) {
			@Pc(35) Class89 local35 = (Class89) arg1;
			return local35.method2881();
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Z")
	public static boolean method1581(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = 0; local1 < Static136.anInt3110; local1++) {
			@Pc(6) Class54 local6 = Static108.aClass54Array1[local1];
			@Pc(15) int local15;
			@Pc(27) int local27;
			@Pc(37) int local37;
			@Pc(47) int local47;
			@Pc(57) int local57;
			if (local6.anInt2687 == 1) {
				local15 = local6.anInt2683 - arg0;
				if (local15 > 0) {
					local27 = local6.anInt2666 + (local6.anInt2675 * local15 >> 8);
					local37 = local6.anInt2665 + (local6.anInt2680 * local15 >> 8);
					local47 = local6.anInt2676 + (local6.anInt2681 * local15 >> 8);
					local57 = local6.anInt2679 + (local6.anInt2689 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2687 == 2) {
				local15 = arg0 - local6.anInt2683;
				if (local15 > 0) {
					local27 = local6.anInt2666 + (local6.anInt2675 * local15 >> 8);
					local37 = local6.anInt2665 + (local6.anInt2680 * local15 >> 8);
					local47 = local6.anInt2676 + (local6.anInt2681 * local15 >> 8);
					local57 = local6.anInt2679 + (local6.anInt2689 * local15 >> 8);
					if (arg2 >= local27 && arg2 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2687 == 3) {
				local15 = local6.anInt2666 - arg2;
				if (local15 > 0) {
					local27 = local6.anInt2683 + (local6.anInt2682 * local15 >> 8);
					local37 = local6.anInt2674 + (local6.anInt2686 * local15 >> 8);
					local47 = local6.anInt2676 + (local6.anInt2681 * local15 >> 8);
					local57 = local6.anInt2679 + (local6.anInt2689 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2687 == 4) {
				local15 = arg2 - local6.anInt2666;
				if (local15 > 0) {
					local27 = local6.anInt2683 + (local6.anInt2682 * local15 >> 8);
					local37 = local6.anInt2674 + (local6.anInt2686 * local15 >> 8);
					local47 = local6.anInt2676 + (local6.anInt2681 * local15 >> 8);
					local57 = local6.anInt2679 + (local6.anInt2689 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg1 >= local47 && arg1 <= local57) {
						return true;
					}
				}
			} else if (local6.anInt2687 == 5) {
				local15 = arg1 - local6.anInt2676;
				if (local15 > 0) {
					local27 = local6.anInt2683 + (local6.anInt2682 * local15 >> 8);
					local37 = local6.anInt2674 + (local6.anInt2686 * local15 >> 8);
					local47 = local6.anInt2666 + (local6.anInt2675 * local15 >> 8);
					local57 = local6.anInt2665 + (local6.anInt2680 * local15 >> 8);
					if (arg0 >= local27 && arg0 <= local37 && arg2 >= local47 && arg2 <= local57) {
						return true;
					}
				}
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!kd", name = "a", descriptor = "(B)Lclient!rc;")
	public static Class2_Sub4_Sub3_Sub3 method1582() {
		@Pc(3) Class2_Sub4_Sub3_Sub3 local3 = new Class2_Sub4_Sub3_Sub3();
		local3.anInt3234 = Static171.anIntArray358[0];
		local3.aByteArray38 = Static81.aByteArrayArray5[0];
		local3.anInt3235 = Static138.anInt3159;
		local3.anInt3238 = Static28.anInt862;
		local3.anInt3237 = Static59.anIntArray135[0];
		local3.anIntArray283 = Static101.anIntArray31;
		local3.anInt3236 = Static147.anIntArray314[0];
		local3.anInt3233 = Static171.anIntArray359[0];
		Static12.method362();
		return local3;
	}

	@OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)V")
	public static void method1583() {
		Static108.aClass14_139.method596();
		Static31.aClass14_206.method596();
		Static153.aClass14_172.method596();
	}
}
