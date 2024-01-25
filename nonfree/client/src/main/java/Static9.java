import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

public final class Static9 {

	@OriginalMember(owner = "client!ah", name = "Q", descriptor = "I")
	public static int anInt250;

	@OriginalMember(owner = "client!ah", name = "W", descriptor = "Lclient!vo;")
	public static Class253 aClass253_1;

	@OriginalMember(owner = "client!ah", name = "ab", descriptor = "I")
	public static int anInt258;

	@OriginalMember(owner = "client!ah", name = "bb", descriptor = "[[[Lclient!tg;")
	public static Class217[][][] aClass217ArrayArrayArray1;

	@OriginalMember(owner = "client!ah", name = "P", descriptor = "Lclient!pi;")
	public static final Class184 aClass184_11 = new Class184(1, 11);

	@OriginalMember(owner = "client!ah", name = "db", descriptor = "Z")
	public static boolean aBoolean14 = false;

	@OriginalMember(owner = "client!ah", name = "eb", descriptor = "I")
	public static int anInt260 = 1;

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(ZBI)Lclient!mk;")
	public static Class3_Sub30 method237(@OriginalArg(0) boolean arg0, @OriginalArg(2) int arg1) {
		@Pc(12) long local12 = (long) (arg1 | (arg0 ? Integer.MIN_VALUE : 0));
		return (Class3_Sub30) Static229.aClass127_24.method3246(local12);
	}

	@OriginalMember(owner = "client!ah", name = "c", descriptor = "(B)V")
	public static void method238() {
		Static139.method2521();
		for (@Pc(8) int local8 = 0; local8 < 4; local8++) {
			Static389.aClass23Array1[local8].method825();
		}
		Static338.method1145();
		Static245.method3782();
		System.gc();
	}

	@OriginalMember(owner = "client!ah", name = "j", descriptor = "(I)V")
	public static void method239() {
		Static116.anInt6680 = -1;
		Static388.anInt6735 = -1;
		Static103.anInt2292 = 0;
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(Lclient!bt;I)Lclient!fu;")
	public static Class82_Sub1 method240(@OriginalArg(0) Class3_Sub2 arg0) {
		return new Class82_Sub1(arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6039(), arg0.method6020(), arg0.method6020(), arg0.method6053());
	}

	@OriginalMember(owner = "client!ah", name = "a", descriptor = "(IBIII)V")
	public static void method241(@OriginalArg(0) int arg0, @OriginalArg(2) int arg1, @OriginalArg(3) int arg2, @OriginalArg(4) int arg3) {
		for (@Pc(5) int local5 = 0; local5 < Static54.anInt1292; local5++) {
			@Pc(13) Rectangle local13 = Class7_Sub1.aRectangleArray4[local5];
			if (local13.width + local13.x > arg3 && local13.x < arg3 + arg2 && arg0 < local13.y + local13.height && arg0 + arg1 > local13.y) {
				Static290.aBooleanArray16[local5] = true;
			}
		}
	}
}
