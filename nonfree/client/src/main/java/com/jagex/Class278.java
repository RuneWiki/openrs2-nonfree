package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ki")
public class Class278 implements Interface31 {

	@OriginalMember(owner = "client!ki", name = "p", descriptor = "Ljava/lang/String;")
	public final String aString195;

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "Lclient!kh;")
	public final Class277 aClass277_12;

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "Lclient!kg;")
	public final Class276 aClass276_12;

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
	public final int anInt4322;

	@OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
	public final int anInt4325;

	@OriginalMember(owner = "client!ki", name = "x", descriptor = "I")
	public final int anInt4323;

	@OriginalMember(owner = "client!ki", name = "s", descriptor = "I")
	public final int anInt4328;

	@OriginalMember(owner = "client!ki", name = "u", descriptor = "I")
	public final int anInt4327;

	@OriginalMember(owner = "client!ki", name = "y", descriptor = "I")
	public final int anInt4324;

	@OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
	public final int anInt4331;

	@OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
	public final int anInt4329;

	@OriginalMember(owner = "client!ki", name = "z", descriptor = "I")
	public final int anInt4330;

	@OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
	public final int anInt4326;

	@OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(Ljava/lang/String;Lclient!kh;Lclient!kg;IIIIIIIIII)V", line = 20)
	Class278(@OriginalArg(0) String arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12) {
		this.aString195 = arg0;
		this.aClass277_12 = arg1;
		this.aClass276_12 = arg2;
		this.anInt4322 = arg3 * -154849125;
		this.anInt4325 = arg4 * 1352980091;
		this.anInt4323 = arg5 * -1492057747;
		this.anInt4328 = arg6 * -693227873;
		this.anInt4327 = arg7 * 904012831;
		this.anInt4324 = arg8 * 392817643;
		this.anInt4331 = arg9 * 255335293;
		this.anInt4329 = arg10 * -1831337157;
		this.anInt4330 = arg11 * 138561083;
		this.anInt4326 = arg12 * 371778099;
	}

	@OriginalMember(owner = "client!ki", name = "l", descriptor = "(Lclient!ahb;)Lclient!ki;", line = 37)
	public static Class278 method25405(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) String local3 = arg0.method20283();
		@Pc(10) Class277 local10 = Class3_Sub30.method11638()[arg0.method20269()];
		@Pc(17) Class276 local17 = Class400.method27575()[arg0.method20269()];
		@Pc(21) int local21 = arg0.method20272();
		@Pc(25) int local25 = arg0.method20272();
		@Pc(29) int local29 = arg0.method20269();
		@Pc(33) int local33 = arg0.method20269();
		@Pc(37) int local37 = arg0.method20269();
		@Pc(41) int local41 = arg0.method20271();
		@Pc(45) int local45 = arg0.method20271();
		@Pc(49) int local49 = arg0.method20375();
		@Pc(53) int local53 = arg0.method20275();
		@Pc(57) int local57 = arg0.method20275();
		return new Class278(local3, local10, local17, local21, local25, local29, local33, local37, local41, local45, local49, local53, local57);
	}

	@OriginalMember(owner = "client!ki", name = "g", descriptor = "()Lclient!ke;", line = 54)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_7;
	}

	@OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)Lclient!ke;", line = 54)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_7;
	}

	@OriginalMember(owner = "client!ki", name = "r", descriptor = "(Lclient!wm;B)V", line = 154)
	static void method25410(@OriginalArg(0) Class555 arg0) {
		Class13_Sub13.aClass555_1 = arg0;
	}

	@OriginalMember(owner = "client!ki", name = "fs", descriptor = "(Lclient!vs;I)V", line = 4979)
	static final void method25408(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class63_Sub1.method13062(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ki", name = "aab", descriptor = "(Lclient!vs;I)V", line = 8701)
	static final void method25409(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub21.aClass10_1 == null ? 0 : 1;
	}

	@OriginalMember(owner = "client!ki", name = "aot", descriptor = "(Lclient!vs;I)V", line = 11579)
	static final void method25406(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class528.method32450();
	}

	@OriginalMember(owner = "client!ki", name = "aru", descriptor = "(Lclient!vs;I)V", line = 12065)
	static final void method25407(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean596 ? 1 : 0;
	}
}
