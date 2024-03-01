package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nz")
public class Class360 {

	@OriginalMember(owner = "client!nz", name = "l", descriptor = "[I")
	public static int[] anIntArray422;

	@OriginalMember(owner = "client!nz", name = "p", descriptor = "Lclient!nz;")
	public static final Class360 aClass360_2 = new Class360(1);

	@OriginalMember(owner = "client!nz", name = "a", descriptor = "Lclient!nz;")
	static final Class360 aClass360_3 = new Class360(0);

	@OriginalMember(owner = "client!nz", name = "g", descriptor = "I")
	final int anInt4647;

	@OriginalMember(owner = "client!nz", name = "<init>", descriptor = "(I)V", line = 9)
	Class360(@OriginalArg(0) int arg0) {
		this.anInt4647 = arg0 * -33385623;
	}

	@OriginalMember(owner = "client!nz", name = "p", descriptor = "(Lclient!wn;B)[Lclient!xe;", line = 15)
	public static Class573[] method26766(@OriginalArg(0) Class556 arg0) {
		@Pc(3) int[] local3 = arg0.method32798();
		@Pc(9) Class573[] local9 = new Class573[local3.length >> 2];
		for (@Pc(11) int local11 = 0; local11 < local9.length; local11++) {
			@Pc(19) Class573 local19 = new Class573();
			local9[local11] = local19;
			local19.anInt5423 = local3[local11 << 2] * -1461281489;
			local19.anInt5424 = local3[(local11 << 2) + 1] * 1776837851;
			local19.anInt5425 = local3[(local11 << 2) + 2] * 1443619699;
			local19.anInt5422 = local3[(local11 << 2) + 3] * -1574001159;
		}
		return local9;
	}

	@OriginalMember(owner = "client!nz", name = "h", descriptor = "(Lclient!mx;B)I", line = 45)
	public static int method26767(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat259, (double) local4.aFloat261);
		local4.method25874();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (int) (local15 / 6.283185307179586D * 16384.0D) & 0x3FFF;
	}

	@OriginalMember(owner = "client!nz", name = "i", descriptor = "(I)Lclient!ahb;", line = 889)
	static Class3_Sub41 method26763() {
		@Pc(2) Class3_Sub41 local2 = Class149.method23126();
		local2.method20409(0L);
		local2.method20260(Class190.aString179);
		local2.method20409(Class190.aLong242 * -1864326197615219743L);
		local2.method20409(client.aLong233 * 94527785818802101L);
		local2.method20298(Class361.aBigInteger7, Class361.aBigInteger6);
		return local2;
	}

	@OriginalMember(owner = "client!nz", name = "acd", descriptor = "(Lclient!vs;I)V", line = 9179)
	static final void method26764(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class44_Sub3.aClass596_1.method33435(local12).anInt5463 * 93059305;
	}

	@OriginalMember(owner = "client!nz", name = "app", descriptor = "(Lclient!vs;I)V", line = 11738)
	static final void method26765(@OriginalArg(0) Class536 arg0) {
		@Pc(2) long local2 = Class176.method23413();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = (int) (local2 / 86400000L) - 11745;
	}
}
