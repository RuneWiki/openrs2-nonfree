package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!eb")
class Class219 implements Interface57 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!eb", name = "this$0", descriptor = "Lclient!fw;")
	final Class261 this$0;

	@OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(Lclient!fw;)V", line = 204)
	Class219(@OriginalArg(0) Class261 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!eb", name = "c", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method26204(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29170();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat277 > local6.aFloat277 - local41 / 2.0F && local19.aFloat277 < local41 / 2.0F + local6.aFloat277 && local19.aFloat278 > local6.aFloat278 - local47 / 2.0F && local19.aFloat278 < local47 / 2.0F + local6.aFloat278) {
				@Pc(98) float local98 = Math.abs(local19.aFloat277 - (local41 / 2.0F + local6.aFloat277));
				@Pc(109) float local109 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat278 - (local6.aFloat277 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!eb", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V", line = 206)
	@Override
	public void method26203(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29170();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat277 > local6.aFloat277 - local41 / 2.0F && local19.aFloat277 < local41 / 2.0F + local6.aFloat277 && local19.aFloat278 > local6.aFloat278 - local47 / 2.0F && local19.aFloat278 < local47 / 2.0F + local6.aFloat278) {
				@Pc(98) float local98 = Math.abs(local19.aFloat277 - (local41 / 2.0F + local6.aFloat277));
				@Pc(109) float local109 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat278 - (local6.aFloat277 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!eb", name = "v", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V", line = 206)
	@Override
	public void method26205(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2) {
		@Pc(2) Class496 local2 = (Class496) arg0;
		@Pc(6) Class447 local6 = local2.method30136();
		@Pc(10) float local10 = local2.method30138();
		@Pc(14) float local14 = local2.method30141();
		@Pc(19) Class447 local19 = this.this$0.method26269();
		@Pc(23) Class447 local23 = Class447.method29160(local6, local19);
		@Pc(25) float local25 = 0.0F;
		@Pc(28) float local28 = local23.method29170();
		if (local28 >= local14) {
			local25 = 0.0F;
		} else {
			@Pc(41) float local41 = (Float) arg2[0];
			@Pc(47) float local47 = (Float) arg2[1];
			if (local19.aFloat277 > local6.aFloat277 - local41 / 2.0F && local19.aFloat277 < local41 / 2.0F + local6.aFloat277 && local19.aFloat278 > local6.aFloat278 - local47 / 2.0F && local19.aFloat278 < local47 / 2.0F + local6.aFloat278) {
				@Pc(98) float local98 = Math.abs(local19.aFloat277 - (local41 / 2.0F + local6.aFloat277));
				@Pc(109) float local109 = Math.abs(local19.aFloat277 - (local6.aFloat277 - local41 / 2.0F));
				@Pc(120) float local120 = Math.abs(local19.aFloat278 - (local6.aFloat277 + local47 / 2.0F));
				@Pc(131) float local131 = Math.abs(local19.aFloat278 - (local6.aFloat277 - local47 / 2.0F));
				@Pc(135) float local135 = local14 - local10;
				@Pc(139) float local139 = Math.min(local98, local109);
				@Pc(143) float local143 = Math.min(local120, local131);
				@Pc(149) float local149 = 1.0F / local135 * local139;
				@Pc(155) float local155 = 1.0F / local135 * local143;
				@Pc(161) float local161 = Math.min(Math.max(local149, 0.0F), 1.0F);
				@Pc(167) float local167 = Math.min(Math.max(local155, 0.0F), 1.0F);
				local25 = Math.min(local161, local167);
			}
		}
		arg1[0] = local25;
		arg1[1] = local25;
	}

	@OriginalMember(owner = "client!eb", name = "gl", descriptor = "(I)V", line = 3608)
	public static final void method25722() {
		if (!client.aBoolean611) {
			client.aFloat250 += (-12.0F - client.aFloat250) / 2.0F;
			client.aBoolean612 = true;
			client.aBoolean611 = true;
		}
	}

	@OriginalMember(owner = "client!eb", name = "kh", descriptor = "(Lclient!yf;I)V", line = 6404)
	static final void method25723(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class98.method7804(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!eb", name = "qx", descriptor = "(Lclient!yf;B)V", line = 7547)
	static final void method25724(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local11.anInt3910 * 1843164247;
	}

	@OriginalMember(owner = "client!eb", name = "ajy", descriptor = "(Lclient!yf;I)V", line = 11203)
	static final void method25725(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
	}

	@OriginalMember(owner = "client!eb", name = "and", descriptor = "(Lclient!yf;I)V", line = 11897)
	static final void method25726(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		Class652.method32971(local13);
	}
}
