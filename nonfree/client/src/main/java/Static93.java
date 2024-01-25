import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static93 {

	@OriginalMember(owner = "client!dea", name = "b", descriptor = "Lclient!paa;")
	public static Class261 aClass261_2;

	@OriginalMember(owner = "client!dea", name = "f", descriptor = "I")
	public static int anInt1715;

	@OriginalMember(owner = "client!dea", name = "h", descriptor = "Lclient!wu;")
	public static Class380 aClass380_31;

	@OriginalMember(owner = "client!dea", name = "c", descriptor = "Lclient!wj;")
	public static final Class375 aClass375_3 = new Class375("game4", 3);

	@OriginalMember(owner = "client!dea", name = "g", descriptor = "I")
	public static int anInt1716 = 0;

	@OriginalMember(owner = "client!dea", name = "i", descriptor = "I")
	public static int anInt1717 = 0;

	@OriginalMember(owner = "client!dea", name = "a", descriptor = "(Lclient!ha;IIIIIIZZ)V")
	public static void method1442(@OriginalArg(0) Class95 arg0, @OriginalArg(1) int arg1, @OriginalArg(4) int arg2, @OriginalArg(5) int arg3, @OriginalArg(6) int arg4, @OriginalArg(7) boolean arg5, @OriginalArg(8) boolean arg6) {
		Static207.aClass95_6 = arg0;
		Static600.anInt9701 = arg1;
		Static268.aBoolean293 = Static600.anInt9701 > 1 && Static207.aClass95_6.method7003();
		Static609.anInt9827 = 9;
		Static192.anInt3298 = 0x1 << Static609.anInt9827;
		Static427.anInt6729 = Static192.anInt3298 >> 1;
		Math.sqrt((double) (Static427.anInt6729 * Static427.anInt6729 + Static427.anInt6729 * Static427.anInt6729));
		Static10.anInt139 = 4;
		Static322.anInt5120 = arg2;
		Class13_Sub1_Sub4_Sub1.lb = arg3;
		Static335.anInt5343 = arg4;
		Static20.aClass123_1 = Static153.method2283();
		Static614.method8261();
		Static316.aClass53ArrayArrayArray3 = new Class53[4][Static322.anInt5120][Class13_Sub1_Sub4_Sub1.lb];
		Static462.aClass76Array3 = new Class76[4];
		if (arg5) {
			Static491.anIntArrayArray50 = new int[Static322.anInt5120][Class13_Sub1_Sub4_Sub1.lb];
			Static136.aByteArrayArray32 = new byte[Static322.anInt5120][Class13_Sub1_Sub4_Sub1.lb];
			Static459.aShortArrayArray25 = new short[Static322.anInt5120][Class13_Sub1_Sub4_Sub1.lb];
			Static253.aClass53ArrayArrayArray2 = new Class53[1][Static322.anInt5120][Class13_Sub1_Sub4_Sub1.lb];
			Static313.aClass76Array1 = new Class76[1];
		} else {
			Static491.anIntArrayArray50 = null;
			Static136.aByteArrayArray32 = null;
			Static459.aShortArrayArray25 = null;
			Static253.aClass53ArrayArrayArray2 = null;
			Static313.aClass76Array1 = null;
		}
		if (arg6) {
			Static478.aLongArrayArrayArray4 = new long[4][arg2][arg3];
			Static90.aClass367Array1 = new Class367[65535];
			Static182.aBooleanArray159 = new boolean[65535];
			Static389.anInt6119 = 0;
		} else {
			Static478.aLongArrayArrayArray4 = null;
			Static90.aClass367Array1 = null;
			Static182.aBooleanArray159 = null;
			Static389.anInt6119 = 0;
		}
		Static643.method8627(false);
		Static597.aClass13_Sub1ArrayArray3 = new Class13_Sub1[2][];
		Static597.aClass13_Sub1ArrayArray3[0] = new Class13_Sub1[Static608.anIntArray672[0]];
		Static597.aClass13_Sub1ArrayArray3[1] = new Class13_Sub1[Static608.anIntArray672[1]];
		Static369.anIntArray426 = new int[2];
		Static417.aClass13_Sub1ArrayArray2 = new Class13_Sub1[2][];
		Static417.aClass13_Sub1ArrayArray2[0] = new Class13_Sub1[Static116.anIntArray145[0]];
		Static417.aClass13_Sub1ArrayArray2[1] = new Class13_Sub1[Static116.anIntArray145[1]];
		Static28.anIntArray63 = new int[2];
		Static139.aClass13_Sub1ArrayArray1 = new Class13_Sub1[2][];
		Static139.aClass13_Sub1ArrayArray1[0] = new Class13_Sub1[Static217.anIntArray239[0]];
		Static139.aClass13_Sub1ArrayArray1[1] = new Class13_Sub1[Static217.anIntArray239[1]];
		Static497.anIntArray571 = new int[2];
		Static466.aClass13_Sub1Array3 = new Class13_Sub1[10000];
		Static508.anInt8493 = 0;
		Static495.aClass13_Sub1Array2 = new Class13_Sub1[5000];
		Static478.anInt9923 = 0;
		Static335.aClass13_Sub1_Sub1Array1 = new Class13_Sub1_Sub1[5000];
		Static332.anInt5259 = 0;
		Static494.aBooleanArrayArray8 = new boolean[Static335.anInt5343 + Static335.anInt5343 + 1][Static335.anInt5343 + Static335.anInt5343 + 1];
		Static186.aBooleanArrayArray5 = new boolean[Static335.anInt5343 + Static335.anInt5343 + 2][Static335.anInt5343 + Static335.anInt5343 + 2];
		Static541.anIntArray603 = new int[Static335.anInt5343 + Static335.anInt5343 + 2];
		Static219.aClass94_4 = Static219.aClass94_3;
		if (Static268.aBoolean293) {
			Static215.aBooleanArrayArrayArray1 = new boolean[4][Static335.anInt5343 + Static335.anInt5343 + 1][Static335.anInt5343 + Static335.anInt5343 + 1];
			Static248.aBooleanArrayArrayArray2 = new boolean[4][][];
			if (Static498.aClass212Array1 != null) {
				Static430.method7070();
			}
			Static498.aClass212Array1 = new Class212[Static600.anInt9701];
			Static207.aClass95_6.method6971(Static498.aClass212Array1.length + 1);
			Static207.aClass95_6.method6982(0);
			for (@Pc(256) int local256 = 0; local256 < Static498.aClass212Array1.length; local256++) {
				Static498.aClass212Array1[local256] = new Class212(local256 + 1, Static207.aClass95_6);
				(new Thread(Static498.aClass212Array1[local256], "wr" + local256)).start();
			}
			@Pc(291) byte local291;
			if (Static600.anInt9701 == 2) {
				local291 = 4;
				Static453.anInt7261 = 2;
			} else if (Static600.anInt9701 == 3) {
				local291 = 6;
				Static453.anInt7261 = 3;
			} else {
				local291 = 8;
				Static453.anInt7261 = 4;
			}
			Static602.aClass358Array1 = new Class358[local291];
			for (@Pc(311) int local311 = 0; local311 < local291; local311++) {
				Static602.aClass358Array1[local311] = new Class358(Static568.aStringArrayArray1[Static600.anInt9701 - 2][local311]);
			}
		} else {
			Static453.anInt7261 = 1;
		}
		Static154.anIntArray188 = new int[Static453.anInt7261 - 1];
		Static584.anIntArray649 = new int[Static453.anInt7261 - 1];
	}
}
