import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static86 {

	@OriginalMember(owner = "client!fj", name = "G", descriptor = "[Lclient!kb;")
	public static Class52[] aClass52Array5;

	@OriginalMember(owner = "client!fj", name = "J", descriptor = "Lclient!rk;")
	public static Class180 aClass180_24;

	@OriginalMember(owner = "client!fj", name = "M", descriptor = "[[Z")
	public static boolean[][] aBooleanArrayArray2;

	@OriginalMember(owner = "client!fj", name = "Q", descriptor = "[Z")
	public static final boolean[] aBooleanArray13 = new boolean[] { true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false };

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(Z)I")
	public static int method1825() {
		@Pc(5) Class89 local5 = Static128.aClass89_3;
		@Pc(7) boolean local7 = false;
		if (Static329.anInt6220 != 0) {
			@Pc(16) Canvas local16 = new Canvas();
			local16.setSize(100, 100);
			local7 = true;
			local5 = Static219.method3871(0, null, null, local16, 0);
		}
		@Pc(33) long local33 = Static335.method5308();
		for (@Pc(35) int local35 = 0; local35 < 10000; local35++) {
			local5.method5401();
		}
		@Pc(59) int local59 = (int) (Static335.method5308() - local33);
		local5.method5477(0, 0, 100, 100, -16777216);
		if (local7) {
			local5.method5387();
		}
		return local59;
	}

	@OriginalMember(owner = "client!fj", name = "a", descriptor = "(Lclient!ug;III[Z)V")
	public static void method1826(@OriginalArg(0) Class7_Sub1_Sub4 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean[] arg4) {
		if (Static331.aClass8Array5 == Static251.aClass8Array6) {
			return;
		}
		@Pc(9) int local9 = Static136.aClass8Array3[arg1].method4169(arg2, arg3);
		for (@Pc(11) int local11 = 0; local11 <= arg1; local11++) {
			if (arg4 == null || arg4[local11]) {
				@Pc(22) Class8 local22 = Static136.aClass8Array3[local11];
				if (local22 != null) {
					local22.method4159(arg0, arg2, local9 - local22.method4169(arg2, arg3), arg3);
				}
			}
		}
	}

	@OriginalMember(owner = "client!fj", name = "b", descriptor = "(II)V")
	public static void method1827() {
		@Pc(9) Class103 local9 = Static192.aClass103_35;
		synchronized (Static192.aClass103_35) {
			Static192.aClass103_35.method2679(5);
		}
	}

	@OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
	public static void method1829() {
		if (Static142.aBoolean235) {
			return;
		}
		Static142.aBoolean235 = true;
		if (Static268.aBoolean393) {
			Static351.aFloat80 = (int) Static351.aFloat80 + 191 & 0xFFFFFF80;
		} else {
			Static290.aFloat73 += (24.0F - Static290.aFloat73) / 2.0F;
		}
		Static13.aBoolean10 = true;
	}
}
