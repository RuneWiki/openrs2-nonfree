package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zt")
public class Class630 {

	@OriginalMember(owner = "client!zt", name = "hh", descriptor = "Lclient!tx;")
	public static Class493 aClass493_1;

	@OriginalMember(owner = "client!zt", name = "p", descriptor = "C")
	char aChar15;

	@OriginalMember(owner = "client!zt", name = "a", descriptor = "I")
	public int anInt5585;

	@OriginalMember(owner = "client!zt", name = "g", descriptor = "Ljava/lang/String;")
	public String aString248;

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "Z")
	public boolean aBoolean854 = true;

	@OriginalMember(owner = "client!zt", name = "<init>", descriptor = "()V", line = 12)
	Class630() {
	}

	@OriginalMember(owner = "client!zt", name = "p", descriptor = "(Lclient!ahb;I)V", line = 16)
	void method33849(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33853(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!zt", name = "l", descriptor = "(Lclient!ahb;)V", line = 16)
	void method33851(@OriginalArg(0) Class3_Sub41 arg0) {
		while (true) {
			@Pc(3) int local3 = arg0.method20269();
			if (local3 == 0) {
				return;
			}
			this.method33853(arg0, local3);
		}
	}

	@OriginalMember(owner = "client!zt", name = "x", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33848(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar15 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.anInt5585 = arg0.method20275() * 1318859193;
		} else if (arg1 == 4) {
			this.aBoolean854 = false;
		} else if (arg1 == 5) {
			this.aString248 = arg0.method20283();
		}
	}

	@OriginalMember(owner = "client!zt", name = "h", descriptor = "(Lclient!ahb;I)V", line = 23)
	void method33852(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar15 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.anInt5585 = arg0.method20275() * 1318859193;
		} else if (arg1 == 4) {
			this.aBoolean854 = false;
		} else if (arg1 == 5) {
			this.aString248 = arg0.method20283();
		}
	}

	@OriginalMember(owner = "client!zt", name = "a", descriptor = "(Lclient!ahb;IB)V", line = 23)
	void method33853(@OriginalArg(0) Class3_Sub41 arg0, @OriginalArg(1) int arg1) {
		if (arg1 == 1) {
			this.aChar15 = Class380.method27288(arg0.method20390());
		} else if (arg1 == 2) {
			this.anInt5585 = arg0.method20275() * 1318859193;
		} else if (arg1 == 4) {
			this.aBoolean854 = false;
		} else if (arg1 == 5) {
			this.aString248 = arg0.method20283();
		}
	}

	@OriginalMember(owner = "client!zt", name = "g", descriptor = "(I)Z", line = 31)
	public boolean method33850() {
		return this.aChar15 == 's';
	}

	@OriginalMember(owner = "client!zt", name = "s", descriptor = "()Z", line = 31)
	public boolean method33854() {
		return this.aChar15 == 's';
	}

	@OriginalMember(owner = "client!zt", name = "jm", descriptor = "(Lclient!vs;I)V", line = 5737)
	static final void method33855(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		RuntimeException_Sub1.method20141(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!zt", name = "vf", descriptor = "(Lclient!vs;I)V", line = 7892)
	static final void method33856(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aBoolean590 ? 1 : 0;
	}
}
