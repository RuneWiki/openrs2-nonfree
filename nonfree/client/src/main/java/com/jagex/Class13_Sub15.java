package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aco")
public class Class13_Sub15 extends Class13 {

	@OriginalMember(owner = "client!aco", name = "by", descriptor = "I")
	public static int anInt669;

	@OriginalMember(owner = "client!aco", name = "a", descriptor = "I")
	final int anInt666;

	@OriginalMember(owner = "client!aco", name = "g", descriptor = "I")
	final int anInt670;

	@OriginalMember(owner = "client!aco", name = "l", descriptor = "I")
	final int anInt668;

	@OriginalMember(owner = "client!aco", name = "h", descriptor = "I")
	final int anInt667;

	@OriginalMember(owner = "client!aco", name = "x", descriptor = "Lclient!oh;")
	Class366 aClass366_2;

	@OriginalMember(owner = "client!aco", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 18)
	Class13_Sub15(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt666 = arg0.method20271() * -1288646753;
		this.anInt670 = arg0.method20269() * -242474965;
		this.anInt668 = arg0.method20269() * -1786902581;
		this.anInt667 = arg0.method20269() * -24848359;
		this.aClass366_2 = Class510.aClass183_1.method23686(Class160.aClass160_9, this, this.anInt666 * 296258655, this.anInt667 * 54592553, this.anInt670 * 852729475, Class141.aClass141_3.method23024(), Class158.aClass158_1, 0.0F, 0.0F, null, 0, this.anInt668 * -1425775133, false);
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26817();
		}
	}

	@OriginalMember(owner = "client!aco", name = "a", descriptor = "(I)V", line = 30)
	@Override
	public void method16888() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26818();
		}
	}

	@OriginalMember(owner = "client!aco", name = "h", descriptor = "()V", line = 30)
	@Override
	public void method16896() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26818();
		}
	}

	@OriginalMember(owner = "client!aco", name = "b", descriptor = "()V", line = 36)
	@Override
	void method16889() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_2);
			this.aClass366_2 = null;
		}
	}

	@OriginalMember(owner = "client!aco", name = "g", descriptor = "(I)V", line = 36)
	@Override
	void method16892() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_2);
			this.aClass366_2 = null;
		}
	}

	@OriginalMember(owner = "client!aco", name = "u", descriptor = "()V", line = 36)
	@Override
	void method16894() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_2);
			this.aClass366_2 = null;
		}
	}

	@OriginalMember(owner = "client!aco", name = "y", descriptor = "()V", line = 36)
	@Override
	void method16895() {
		if (this.aClass366_2 != null) {
			this.aClass366_2.method26819(50);
			Class510.aClass183_1.method23684(this.aClass366_2);
			this.aClass366_2 = null;
		}
	}

	@OriginalMember(owner = "client!aco", name = "ajn", descriptor = "(Lclient!vs;B)V", line = 10779)
	static final void method6548(@OriginalArg(0) Class536 arg0) {
		Class158.method23201(arg0, Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3);
	}
}
