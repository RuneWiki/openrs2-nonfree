package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agi")
public class Class110_Sub12 extends Class110 {

	@OriginalMember(owner = "client!agi", name = "n", descriptor = "I")
	final int anInt948;

	@OriginalMember(owner = "client!agi", name = "m", descriptor = "I")
	final int anInt946;

	@OriginalMember(owner = "client!agi", name = "k", descriptor = "I")
	final int anInt947;

	@OriginalMember(owner = "client!agi", name = "f", descriptor = "I")
	final int anInt949;

	@OriginalMember(owner = "client!agi", name = "w", descriptor = "I")
	final int anInt945;

	@OriginalMember(owner = "client!agi", name = "<init>", descriptor = "(Lclient!alw;)V", line = 15)
	Class110_Sub12(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt948 = arg0.method22415() * -1377937631;
		@Pc(13) int local13 = arg0.method22413();
		if ((local13 & 0x1) == 0) {
			this.anInt946 = 777313641;
			this.anInt947 = -896594073;
		} else {
			this.anInt946 = arg0.method22415() * -777313641;
			this.anInt947 = arg0.method22415() * 896594073;
		}
		if ((local13 & 0x2) == 0) {
			this.anInt949 = 728641761;
			this.anInt945 = 964142953;
		} else {
			this.anInt949 = arg0.method22415() * -728641761;
			this.anInt945 = arg0.method22415() * -964142953;
		}
		if ((local13 & 0x4) != 0) {
			@Pc(71) int local71 = arg0.method22415();
			@Pc(75) int local75 = arg0.method22415();
			@Pc(81) int local81 = local71 * 255 / local75;
			if (local71 > 0 && local81 < 1) {
			}
		}
	}

	@OriginalMember(owner = "client!agi", name = "f", descriptor = "()V", line = 44)
	@Override
	public void method20140() {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt948 * 1441000673].method25807();
		local8.method19958(this.anInt946 * 1015446823, this.anInt947 * -128556119, this.anInt949 * 1886711007, this.anInt945 * -1441749209, client.anInt3485, 0);
	}

	@OriginalMember(owner = "client!agi", name = "n", descriptor = "(I)V", line = 44)
	@Override
	public void method20138() {
		@Pc(8) Class132_Sub1_Sub1_Sub1 local8 = Class249.aClass239Array1[this.anInt948 * 1441000673].method25807();
		local8.method19958(this.anInt946 * 1015446823, this.anInt947 * -128556119, this.anInt949 * 1886711007, this.anInt945 * -1441749209, client.anInt3485, 0);
	}
}
