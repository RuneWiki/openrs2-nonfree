package com.jagex;

import java.util.Iterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ea")
class Class218 implements Interface23 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!ea", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Lclient!akv;Ljava/lang/String;B)I", line = 18)
	public static int method25709(@OriginalArg(0) Class77_Sub39 arg0, @OriginalArg(1) String arg1) {
		@Pc(4) int local4 = arg0.anInt3089 * 31645619;
		@Pc(8) byte[] local8 = Class398.method28451(arg1);
		arg0.method22471(local8.length);
		arg0.anInt3089 += Class310.aClass298_1.method27057(local8, 0, local8.length, arg0.aByteArray53, arg0.anInt3089 * 31645619) * -1387468933;
		return arg0.anInt3089 * 31645619 - local4;
	}

	@OriginalMember(owner = "client!ea", name = "x", descriptor = "(B)Lclient!zh;", line = 122)
	public static Class690 method25710() {
		return Class314.aClass690_1 == null ? Class690.aClass690_3 : Class314.aClass690_1;
	}

	@OriginalMember(owner = "client!ea", name = "<init>", descriptor = "(Lclient!fw;)V", line = 267)
	Class218(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!ea", name = "v", descriptor = "(Lclient!vg;B)V", line = 269)
	void method25711(@OriginalArg(0) Interface69 arg0) {
		@Pc(5) Iterator local5 = this.this$0.method26257().iterator();
		while (local5.hasNext()) {
			@Pc(12) Class496 local12 = (Class496) local5.next();
			if (local12.method30129() == arg0) {
				local12.method30092();
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "l", descriptor = "(Lclient!vg;)V", line = 269)
	void method25712(@OriginalArg(0) Interface69 arg0) {
		@Pc(5) Iterator local5 = this.this$0.method26257().iterator();
		while (local5.hasNext()) {
			@Pc(12) Class496 local12 = (Class496) local5.next();
			if (local12.method30129() == arg0) {
				local12.method30092();
				local5.remove();
			}
		}
	}

	@OriginalMember(owner = "client!ea", name = "c", descriptor = "(Ljava/lang/Object;)V", line = 280)
	@Override
	public void method25708(@OriginalArg(0) Object arg0) {
		this.method25711((Interface69) arg0);
	}

	@OriginalMember(owner = "client!ea", name = "p", descriptor = "(Ljava/lang/Object;I)V", line = 280)
	@Override
	public void method25707(@OriginalArg(0) Object arg0) {
		this.method25711((Interface69) arg0);
	}

	@OriginalMember(owner = "client!ea", name = "lm", descriptor = "(Lclient!yf;I)V", line = 6584)
	static final void method25713(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class143_Sub2.method14940(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "lg", descriptor = "(Lclient!yf;I)V", line = 6640)
	static final void method25714(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class595.method31913(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ea", name = "qp", descriptor = "(Lclient!yf;B)V", line = 7484)
	static final void method25715(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3892 * 1033849275;
	}
}
