import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static95 {

	@OriginalMember(owner = "client!qe", name = "f", descriptor = "Lclient!md;")
	public static Class30 aClass30_15;

	@OriginalMember(owner = "client!qe", name = "b", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1339 = Static33.method650("cross");

	@OriginalMember(owner = "client!qe", name = "d", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1340 = Static33.method650("http:)4)4");

	@OriginalMember(owner = "client!qe", name = "e", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1341 = Static33.method650("Sichtbare Karte vorbereitet)3");

	@OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
	public static int anInt2479 = 0;

	@OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
	public static int anInt2480 = 0;

	@OriginalMember(owner = "client!qe", name = "i", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1342 = Static33.method650("Duell akzeptieren");

	@OriginalMember(owner = "client!qe", name = "j", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1343 = Static33.method650("Benutzername: ");

	@OriginalMember(owner = "client!qe", name = "q", descriptor = "Lclient!oa;")
	private static Class56 aClass56_1347 = Static33.method650("Login");

	@OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1344 = aClass56_1347;

	@OriginalMember(owner = "client!qe", name = "m", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1345 = Static33.method650("va");

	@OriginalMember(owner = "client!qe", name = "p", descriptor = "Lclient!oa;")
	public static Class56 aClass56_1346 = Static33.method650("backbase2");

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
	public static void method1667() {
		Static87.aClass52_47.method1346();
		Static14.aClass52_6.method1346();
		Static79.aClass52_40.method1346();
		Static17.aClass52_10.method1346();
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
	public static void method1668() {
		aClass56_1347 = null;
		aClass56_1339 = null;
		aClass56_1343 = null;
		aClass56_1345 = null;
		aClass56_1340 = null;
		aClass56_1344 = null;
		aClass56_1342 = null;
		aClass56_1346 = null;
		aClass30_15 = null;
		aClass56_1341 = null;
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(Lclient!wb;I)V")
	public static void method1669(@OriginalArg(0) Class3_Sub1_Sub2_Sub4 arg0) {
		arg0.anInt3172 = 0;
		if (arg0.anInt3179 == 0) {
			arg0.anInt3183 = 1024;
		}
		@Pc(17) int local17 = arg0.anInt3142 - Static98.anInt2566;
		@Pc(31) int local31 = arg0.anInt3190 * 64 + arg0.anInt3159 * 128;
		if (arg0.anInt3179 == 1) {
			arg0.anInt3183 = 1536;
		}
		arg0.anInt3196 += (local31 - arg0.anInt3196) / local17;
		if (arg0.anInt3179 == 2) {
			arg0.anInt3183 = 0;
		}
		@Pc(72) int local72 = arg0.anInt3190 * 64 + arg0.anInt3157 * 128;
		arg0.anInt3187 += (local72 - arg0.anInt3187) / local17;
		if (arg0.anInt3179 == 3) {
			arg0.anInt3183 = 512;
		}
	}

	@OriginalMember(owner = "client!qe", name = "a", descriptor = "(IZ)[B")
	public static synchronized byte[] method1670(@OriginalArg(0) int arg0) {
		@Pc(26) byte[] local26;
		if (arg0 == 100 && Static40.anInt1064 > 0) {
			local26 = Static103.aByteArrayArray9[--Static40.anInt1064];
			Static103.aByteArrayArray9[Static40.anInt1064] = null;
			return local26;
		} else if (arg0 == 5000 && Static83.anInt2255 > 0) {
			local26 = Static16.aByteArrayArray4[--Static83.anInt2255];
			Static16.aByteArrayArray4[Static83.anInt2255] = null;
			return local26;
		} else if (arg0 == 30000 && Static100.anInt2568 > 0) {
			local26 = Static7.aByteArrayArray3[--Static100.anInt2568];
			Static7.aByteArrayArray3[Static100.anInt2568] = null;
			return local26;
		} else {
			return new byte[arg0];
		}
	}
}
