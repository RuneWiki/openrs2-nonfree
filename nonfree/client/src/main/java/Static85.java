import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static85 {

	@OriginalMember(owner = "client!dv", name = "Gb", descriptor = "I")
	public static int anInt1705;

	@OriginalMember(owner = "client!dv", name = "Bb", descriptor = "Lclient!rb;")
	public static final Class211 aClass211_42 = new Class211(15, 0);

	@OriginalMember(owner = "client!dv", name = "Eb", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_28 = new Class134(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");

	@OriginalMember(owner = "client!dv", name = "Hb", descriptor = "Lclient!kc;")
	public static final Class134 aClass134_29 = new Class134(" is already on your friends list.", " steht bereits auf deiner Freunde-Liste!", " est déjà dans votre liste d'amis.", " já está na sua lista de amigos.");

	@OriginalMember(owner = "client!dv", name = "Ib", descriptor = "[Lclient!gk;")
	public static Class65_Sub1[] aClass65_Sub1Array3 = new Class65_Sub1[0];

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIII)Z")
	public static boolean method1355(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2) {
		@Pc(5) boolean local5 = true;
		@Pc(20) Interface2 local20 = (Interface2) Static113.method1718(arg0, arg1, arg2);
		if (local20 != null) {
			local5 = Static386.method4945(local20) & true;
		}
		local20 = (Interface2) Static144.method2120(arg0, arg1, arg2, bn.class);
		if (local20 != null) {
			local5 &= Static386.method4945(local20);
		}
		local20 = (Interface2) Static350.method4653(arg0, arg1, arg2);
		if (local20 != null) {
			local5 &= Static386.method4945(local20);
		}
		return local5;
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(IIIII)V")
	public static void method1356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(16) int local16 = 0;
		@Pc(18) int local18 = arg0;
		@Pc(21) int local21 = -arg0;
		@Pc(23) int local23 = -1;
		@Pc(32) int local32 = Static331.method4435(arg1 + arg0, Static215.anInt3546, Static317.anInt6670);
		@Pc(41) int local41 = Static331.method4435(arg1 - arg0, Static215.anInt3546, Static317.anInt6670);
		Static216.method2862(local41, local32, arg3, Static229.anIntArrayArray26[arg2]);
		while (local18 > local16) {
			local23 += 2;
			local21 += local23;
			@Pc(72) int local72;
			@Pc(76) int local76;
			@Pc(99) int local99;
			@Pc(108) int local108;
			if (local21 > 0) {
				local18--;
				local21 -= local18 << 1;
				local72 = arg2 - local18;
				local76 = local18 + arg2;
				if (local76 >= Static219.anInt6125 && Static155.anInt2670 >= local72) {
					local99 = Static331.method4435(arg1 + local16, Static215.anInt3546, Static317.anInt6670);
					local108 = Static331.method4435(arg1 - local16, Static215.anInt3546, Static317.anInt6670);
					if (local76 <= Static155.anInt2670) {
						Static216.method2862(local108, local99, arg3, Static229.anIntArrayArray26[local76]);
					}
					if (local72 >= Static219.anInt6125) {
						Static216.method2862(local108, local99, arg3, Static229.anIntArrayArray26[local72]);
					}
				}
			}
			local16++;
			local72 = arg2 - local16;
			local76 = arg2 + local16;
			if (local76 >= Static219.anInt6125 && local72 <= Static155.anInt2670) {
				local99 = Static331.method4435(local18 + arg1, Static215.anInt3546, Static317.anInt6670);
				local108 = Static331.method4435(arg1 - local18, Static215.anInt3546, Static317.anInt6670);
				if (Static155.anInt2670 >= local76) {
					Static216.method2862(local108, local99, arg3, Static229.anIntArrayArray26[local76]);
				}
				if (Static219.anInt6125 <= local72) {
					Static216.method2862(local108, local99, arg3, Static229.anIntArrayArray26[local72]);
				}
			}
		}
	}

	@OriginalMember(owner = "client!dv", name = "a", descriptor = "(Ljava/lang/String;Z)I")
	public static int method1357(@OriginalArg(0) String arg0) {
		@Pc(8) int local8 = arg0.length();
		@Pc(10) int local10 = 0;
		for (@Pc(12) int local12 = 0; local12 < local8; local12++) {
			local10 = Static409.method5179(arg0.charAt(local12)) + (local10 << 5) - local10;
		}
		return local10;
	}
}
