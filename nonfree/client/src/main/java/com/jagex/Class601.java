package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ur")
public class Class601 implements Interface63 {

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "Lclient!acw;")
	final Class72 aClass72_3;

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "Ljava/lang/String;")
	final String aString231;

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "I")
	final int anInt5549;

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "Ljava/lang/String;")
	final String aString230;

	@OriginalMember(owner = "client!ur", name = "<init>", descriptor = "(Lclient!acw;Ljava/lang/String;ILjava/lang/Throwable;)V", line = 87)
	Class601(@OriginalArg(0) Class72 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) Throwable arg3) {
		this.aClass72_3 = arg0;
		this.aString231 = arg1;
		this.anInt5549 = arg2 * 1989560637;
		this.aString230 = arg3 == null ? null : arg3.getMessage();
	}

	@OriginalMember(owner = "client!ur", name = "e", descriptor = "(I)V", line = 95)
	@Override
	public void method31895() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22510(this.aClass72_3.method36920());
		local5.aClass93_Sub41_Sub2_1.method22402(this.aString231);
		local5.aClass93_Sub41_Sub2_1.method22454(this.anInt5549 * -1620060651);
		local5.aClass93_Sub41_Sub2_1.method22402(Class527.aString223);
		if (this.aString230 == null) {
			local5.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22402(local53);
		}
		local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16);
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!ur", name = "m", descriptor = "()V", line = 95)
	@Override
	public void method31896() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22510(this.aClass72_3.method36920());
		local5.aClass93_Sub41_Sub2_1.method22402(this.aString231);
		local5.aClass93_Sub41_Sub2_1.method22454(this.anInt5549 * -1620060651);
		local5.aClass93_Sub41_Sub2_1.method22402(Class527.aString223);
		if (this.aString230 == null) {
			local5.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22402(local53);
		}
		local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16);
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!ur", name = "n", descriptor = "()V", line = 95)
	@Override
	public void method31894() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22510(this.aClass72_3.method36920());
		local5.aClass93_Sub41_Sub2_1.method22402(this.aString231);
		local5.aClass93_Sub41_Sub2_1.method22454(this.anInt5549 * -1620060651);
		local5.aClass93_Sub41_Sub2_1.method22402(Class527.aString223);
		if (this.aString230 == null) {
			local5.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22402(local53);
		}
		local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16);
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!ur", name = "f", descriptor = "()V", line = 95)
	@Override
	public void method31898() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22510(this.aClass72_3.method36920());
		local5.aClass93_Sub41_Sub2_1.method22402(this.aString231);
		local5.aClass93_Sub41_Sub2_1.method22454(this.anInt5549 * -1620060651);
		local5.aClass93_Sub41_Sub2_1.method22402(Class527.aString223);
		if (this.aString230 == null) {
			local5.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22402(local53);
		}
		local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16);
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!ur", name = "k", descriptor = "()V", line = 95)
	@Override
	public void method31897() {
		@Pc(5) Class93_Sub22 local5 = Class102.method2592(Class446.aClass446_48, client.aClass175_2.aClass24_2);
		@Pc(16) int local16 = (local5.aClass93_Sub41_Sub2_1.anInt3070 += -1445626955) * 212851357;
		local5.aClass93_Sub41_Sub2_1.method22510(this.aClass72_3.method36920());
		local5.aClass93_Sub41_Sub2_1.method22402(this.aString231);
		local5.aClass93_Sub41_Sub2_1.method22454(this.anInt5549 * -1620060651);
		local5.aClass93_Sub41_Sub2_1.method22402(Class527.aString223);
		if (this.aString230 == null) {
			local5.aClass93_Sub41_Sub2_1.method22510(0);
		} else {
			local5.aClass93_Sub41_Sub2_1.method22510(1);
			@Pc(53) String local53 = this.aString230;
			if (local53.length() > 100) {
				local53 = local53.substring(0, 100);
			}
			local5.aClass93_Sub41_Sub2_1.method22402(local53);
		}
		local5.aClass93_Sub41_Sub2_1.method22537(local5.aClass93_Sub41_Sub2_1.anInt3070 * 212851357 - local16);
		client.aClass175_2.method24351(local5);
	}

	@OriginalMember(owner = "client!ur", name = "pd", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 7762)
	static final void method31850(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5888 -= 957530791) * 587908375];
		if (Class532.method30597(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray40 = Class499.method30148(local13, arg2);
		arg0.aBoolean680 = true;
	}

	@OriginalMember(owner = "client!ur", name = "aoq", descriptor = "(Lclient!yf;S)V", line = 12631)
	static final void method31851(@OriginalArg(0) Class681 arg0) throws Exception_Sub3 {
		arg0.anInt5891 -= 463840436;
		@Pc(14) float local14 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(25) float local25 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		@Pc(36) float local36 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2];
		@Pc(49) float local49 = (float) arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3] / 1000.0F;
		Class65.aClass123_Sub1_2.method8939(Class472.method29529(local14, local25, local36), local49);
	}

	@OriginalMember(owner = "client!ur", name = "avn", descriptor = "(Lclient!yf;I)V", line = 13449)
	static final void method31853(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}

	@OriginalMember(owner = "client!ur", name = "avv", descriptor = "(Lclient!yf;I)V", line = 13497)
	static final void method31852(@OriginalArg(0) Class681 arg0) {
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
	}
}
