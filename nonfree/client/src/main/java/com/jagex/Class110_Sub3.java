package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!afp")
public class Class110_Sub3 extends Class110 {

	@OriginalMember(owner = "client!afp", name = "s", descriptor = "Lclient!aac;")
	static Class5 aClass5_7;

	@OriginalMember(owner = "client!afp", name = "n", descriptor = "I")
	final int anInt835;

	@OriginalMember(owner = "client!afp", name = "m", descriptor = "I")
	final int anInt834;

	@OriginalMember(owner = "client!afp", name = "k", descriptor = "I")
	final int anInt838;

	@OriginalMember(owner = "client!afp", name = "f", descriptor = "I")
	final int anInt836;

	@OriginalMember(owner = "client!afp", name = "w", descriptor = "I")
	final int anInt837;

	@OriginalMember(owner = "client!afp", name = "<init>", descriptor = "(Lclient!alw;)V", line = 13)
	Class110_Sub3(@OriginalArg(0) Class93_Sub41 arg0) {
		super(arg0);
		this.anInt835 = arg0.method22415() * 25858007;
		@Pc(13) int local13 = arg0.method22419();
		this.anInt834 = (local13 >>> 16) * -1200593097;
		this.anInt838 = (local13 & 0xFFFF) * 541750459;
		this.anInt836 = arg0.method22413() * 1446986663;
		this.anInt837 = arg0.method22431() * -1126680193;
	}

	@OriginalMember(owner = "client!afp", name = "f", descriptor = "()V", line = 23)
	@Override
	public void method20140() {
		Class249.aClass239Array1[this.anInt835 * -1364798489].method25804(this.anInt834 * 45612679, this.anInt838 * 479703155, this.anInt836 * 322253847, this.anInt837 * -2132965761);
	}

	@OriginalMember(owner = "client!afp", name = "n", descriptor = "(I)V", line = 23)
	@Override
	public void method20138() {
		Class249.aClass239Array1[this.anInt835 * -1364798489].method25804(this.anInt834 * 45612679, this.anInt838 * 479703155, this.anInt836 * 322253847, this.anInt837 * -2132965761);
	}

	@OriginalMember(owner = "client!afp", name = "na", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7379)
	static final void method7101(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		Class499.method30148(local13, arg2);
	}
}
