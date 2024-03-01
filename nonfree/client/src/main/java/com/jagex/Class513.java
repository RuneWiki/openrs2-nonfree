package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ut")
public class Class513 {

	@OriginalMember(owner = "client!ut", name = "s", descriptor = "I")
	public static final int anInt5260 = -60;

	@OriginalMember(owner = "client!ut", name = "a", descriptor = "I")
	public static final int anInt5261 = 13156520;

	@OriginalMember(owner = "client!ut", name = "g", descriptor = "F")
	public static final float aFloat319 = 1.1523438F;

	@OriginalMember(owner = "client!ut", name = "l", descriptor = "F")
	public static final float aFloat320 = 0.69921875F;

	@OriginalMember(owner = "client!ut", name = "h", descriptor = "F")
	public static final float aFloat321 = 1.2F;

	@OriginalMember(owner = "client!ut", name = "j", descriptor = "I")
	public static final int anInt5262 = 2816;

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "I")
	public static final int anInt5263 = -50;

	@OriginalMember(owner = "client!ut", name = "u", descriptor = "I")
	public static final int anInt5264 = -50;

	@OriginalMember(owner = "client!ut", name = "y", descriptor = "I")
	public static final int anInt5265 = 0;

	@OriginalMember(owner = "client!ut", name = "p", descriptor = "I")
	public static final int anInt5266 = 16777215;

	@OriginalMember(owner = "client!ut", name = "c", descriptor = "I")
	public static final int anInt5267 = 2816;

	@OriginalMember(owner = "client!ut", name = "z", descriptor = "I")
	public static final int anInt5268 = 2816;

	@OriginalMember(owner = "client!ut", name = "b", descriptor = "I")
	static final int anInt5269 = 5000;

	@OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 18)
	Class513() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ut", name = "x", descriptor = "(B)I", line = 89)
	public static int method29602() {
		return 10;
	}

	@OriginalMember(owner = "client!ut", name = "yp", descriptor = "(Lclient!vs;I)V", line = 8497)
	static final void method29597(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		Class210.method24248(local13, true);
	}

	@OriginalMember(owner = "client!ut", name = "aan", descriptor = "(Lclient!vs;I)V", line = 8835)
	static final void method29598(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local13 % local23;
	}

	@OriginalMember(owner = "client!ut", name = "aei", descriptor = "(Lclient!vs;I)V", line = 9776)
	static final void method29599(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		arg0.aClass283_1.anIntArray410[local13] = local23;
	}

	@OriginalMember(owner = "client!ut", name = "apd", descriptor = "(Lclient!vs;I)V", line = 11728)
	static final void method29600(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aShort150;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aShort147;
	}

	@OriginalMember(owner = "client!ut", name = "apy", descriptor = "(Lclient!vs;B)V", line = 11754)
	static final void method29601(@OriginalArg(0) Class536 arg0) {
		@Pc(2) long local2 = Class176.method23413();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class272.method25322(local2);
	}
}
