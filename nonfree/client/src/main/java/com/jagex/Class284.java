package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!kp")
public class Class284 implements Interface56 {

	@OriginalMember(owner = "client!kp", name = "ae", descriptor = "I")
	static int anInt4354;

	@OriginalMember(owner = "client!kp", name = "k", descriptor = "I")
	static int anInt4355;

	@OriginalMember(owner = "client!kp", name = "go", descriptor = "Lclient!ss;")
	public static Class465 aClass465_1;

	@OriginalMember(owner = "client!kp", name = "p", descriptor = "Lclient!kp;")
	static final Class284 aClass284_2 = new Class284(0, -1, true, false, true);

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "Lclient!kp;")
	static final Class284 aClass284_1 = new Class284(1, 0, true, true, true);

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "Lclient!kp;")
	static final Class284 aClass284_6 = new Class284(2, 1, true, true, false);

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "Lclient!kp;")
	static final Class284 aClass284_3 = new Class284(3, 8, false, true, true);

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "Lclient!kp;")
	static final Class284 aClass284_4 = new Class284(4, 9, false, false, true);

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "Lclient!kp;")
	static final Class284 aClass284_5 = new Class284(5, 10, false, true, true);

	@OriginalMember(owner = "client!kp", name = "s", descriptor = "I")
	final int anInt4352;

	@OriginalMember(owner = "client!kp", name = "u", descriptor = "I")
	public final int anInt4353;

	@OriginalMember(owner = "client!kp", name = "y", descriptor = "Z")
	public final boolean aBoolean707;

	@OriginalMember(owner = "client!kp", name = "b", descriptor = "Z")
	public final boolean aBoolean708;

	@OriginalMember(owner = "client!kp", name = "g", descriptor = "()[Lclient!kp;", line = 19)
	public static Class284[] method25462() {
		return new Class284[] { aClass284_2, aClass284_3, aClass284_4, aClass284_5, aClass284_1, aClass284_6 };
	}

	@OriginalMember(owner = "client!kp", name = "<init>", descriptor = "(IIZZZ)V", line = 22)
	Class284(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) boolean arg4) {
		this.anInt4352 = arg0 * 2145183161;
		this.anInt4353 = arg1 * 224954069;
		this.aBoolean707 = arg3;
		this.aBoolean708 = arg4;
	}

	@OriginalMember(owner = "client!kp", name = "h", descriptor = "()I", line = 30)
	@Override
	public int method33766() {
		return this.anInt4352 * 916033673;
	}

	@OriginalMember(owner = "client!kp", name = "x", descriptor = "()I", line = 30)
	@Override
	public int method33764() {
		return this.anInt4352 * 916033673;
	}

	@OriginalMember(owner = "client!kp", name = "l", descriptor = "()I", line = 30)
	@Override
	public int method33767() {
		return this.anInt4352 * 916033673;
	}

	@OriginalMember(owner = "client!kp", name = "a", descriptor = "(I)I", line = 30)
	@Override
	public int method33765() {
		return this.anInt4352 * 916033673;
	}

	@OriginalMember(owner = "client!kp", name = "cb", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4494)
	static final void method25469(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.aBoolean630 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] == 1;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "dt", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 4664)
	static final void method25466(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		if (arg0.anInt3572 * 381674943 != local12) {
			if (local12 == -1) {
				arg0.aClass71_6 = null;
			} else {
				if (arg0.aClass71_6 == null) {
					arg0.aClass71_6 = new Class71_Sub2();
				}
				arg0.aClass71_6.method20038(local12);
			}
			arg0.anInt3572 = local12 * 225643071;
			Class223.method24442(arg0);
		}
		if (arg0.anInt3491 * 18828465 == -1 && !arg1.aBoolean657) {
			Class406.method27658(arg0.anInt3570 * 954808515);
		}
	}

	@OriginalMember(owner = "client!kp", name = "ev", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 4888)
	static final void method25470(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		arg0.anInt3532 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381] * -1727519581;
		Class223.method24442(arg0);
	}

	@OriginalMember(owner = "client!kp", name = "jf", descriptor = "(Lclient!fo;Lclient!vs;B)V", line = 5865)
	static final void method25467(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class536 arg1) {
		@Pc(1) byte local1 = 10;
		@Pc(14) int local14 = arg1.anIntArray496[(arg1.anInt5319 -= 312124549) * 960738381];
		Class131.method22899(arg0, local1, local14, arg1);
	}

	@OriginalMember(owner = "client!kp", name = "acu", descriptor = "(Lclient!vs;B)V", line = 9147)
	static final void method25463(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class594 local17 = Class44_Sub3.aClass596_1.method33435(local12);
		if (local17.anInt5495 * 847909323 >= 0 && local17.anInt5494 * 1292251097 >= 0) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5494 * 1292251097;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local12;
		}
	}

	@OriginalMember(owner = "client!kp", name = "aeq", descriptor = "(Lclient!vs;I)V", line = 9800)
	static final void method25468(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		@Pc(31) boolean local31 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1;
		Class217.method24351(local13, local31);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class177.anInt3474 * -908764545;
	}

	@OriginalMember(owner = "client!kp", name = "afl", descriptor = "(Lclient!vs;I)V", line = 9867)
	static final void method25464(@OriginalArg(0) Class536 arg0) {
		throw new RuntimeException("");
	}

	@OriginalMember(owner = "client!kp", name = "amy", descriptor = "(Lclient!vs;I)V", line = 11269)
	static final void method25465(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub1_1, local12);
		client.aClass370_1.method26968();
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
