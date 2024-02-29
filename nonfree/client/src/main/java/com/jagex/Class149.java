package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zs")
public abstract class Class149 {

	@OriginalMember(owner = "client!zs", name = "gw", descriptor = "Lclient!abk;")
	public static Class35 aClass35_10;

	@OriginalMember(owner = "client!zs", name = "a", descriptor = "I")
	static int anInt3139;

	@OriginalMember(owner = "client!zs", name = "p", descriptor = "Lclient!im;")
	final Class107 aClass107_16;

	@OriginalMember(owner = "client!zs", name = "<init>", descriptor = "(Lclient!im;)V", line = 12)
	Class149(@OriginalArg(0) Class107 arg0) {
		this.aClass107_16 = arg0;
	}

	@OriginalMember(owner = "client!zs", name = "ax", descriptor = "(ILjava/lang/String;I)V", line = 201)
	static void method23149(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1) {
		@Pc(4) Class77_Sub1_Sub6 local4 = Class456.method29469(2, (long) arg0);
		local4.method21545();
		local4.aString89 = arg1;
	}

	@OriginalMember(owner = "client!zs", name = "fl", descriptor = "(ZI)V", line = 1907)
	public static void method23150(@OriginalArg(0) boolean arg0) {
		if (arg0) {
			if (client.anInt3459 * -993629849 != -1) {
				Class248.method26154(client.anInt3459 * -993629849);
			}
			for (@Pc(16) Class77_Sub38 local16 = (Class77_Sub38) client.aClass12_20.method190(); local16 != null; local16 = (Class77_Sub38) client.aClass12_20.method192()) {
				if (!local16.method24066()) {
					local16 = (Class77_Sub38) client.aClass12_20.method190();
					if (local16 == null) {
						break;
					}
				}
				Class77_Sub41.method14838(local16, true, false);
			}
			client.anInt3459 = 1328962985;
			client.aClass12_20 = new Class12(8);
			Class696.method36463();
			client.anInt3459 = Class617.aClass629_1.anInt5666 * 858200713;
			if (client.anInt3459 * -993629849 != -1) {
				Class290.method27000(false);
				Class430.method28815();
				Class469.method29595(client.anInt3459 * -993629849, null);
			}
		}
		Class524.method30635();
		Class597.aClass107_Sub1_2.method8777(true);
		Class589.aBoolean814 = false;
		Class8.method95();
		client.anInt3472 = 411567433;
		Class560.method31287(client.anInt3396 * 965081907);
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3 = new Class104_Sub1_Sub1_Sub1_Sub2(null);
		client.aMap15.clear();
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.method24106((float) (client.aClass517_1.method30411() * 512 / 2), 0.0F, (float) (client.aClass517_1.method30417() * 512 / 2));
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray274[0] = client.aClass517_1.method30411() / 2;
		Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.anIntArray275[0] = client.aClass517_1.method30417() / 2;
		Class633.anInt5710 = 0;
		Class96_Sub13.anInt883 = 0;
		if (Class11.anInt36 * -891094135 == 4) {
			Class96_Sub13.anInt883 = (Class96_Sub7.anInt829 * -986862531 << 9) * -2079086379;
			Class633.anInt5710 = (Class96_Sub9.anInt833 * 1718679887 << 9) * -866237299;
		} else {
			Class61.method902();
		}
		client.aClass517_1.method30443().method32293();
	}

	@OriginalMember(owner = "client!zs", name = "lg", descriptor = "(ZI)V", line = 11873)
	public static final void method23151(@OriginalArg(0) boolean arg0) {
		@Pc(5) Class77_Sub20 local5 = Class365.method28132(Class414.aClass414_105, client.aClass82_2.aClass16_1);
		client.aClass82_2.method2004(local5);
		for (@Pc(14) Class77_Sub38 local14 = (Class77_Sub38) client.aClass12_20.method190(); local14 != null; local14 = (Class77_Sub38) client.aClass12_20.method192()) {
			if (!local14.method24066()) {
				local14 = (Class77_Sub38) client.aClass12_20.method190();
				if (local14 == null) {
					break;
				}
			}
			if (local14.anInt3114 * 410447 == 0) {
				Class77_Sub41.method14838(local14, true, arg0);
			}
		}
		if (client.aClass277_5 != null) {
			Class461.method29531(client.aClass277_5);
			client.aClass277_5 = null;
		}
	}

	@OriginalMember(owner = "client!zs", name = "w", descriptor = "(Lclient!akv;I)V")
	public abstract void method23152(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!zs", name = "v", descriptor = "(I)Lclient!oo;")
	public abstract Class447 method23153();

	@OriginalMember(owner = "client!zs", name = "c", descriptor = "(B)Z")
	public abstract boolean method23154();

	@OriginalMember(owner = "client!zs", name = "q", descriptor = "(F)V")
	public abstract void method23155(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!zs", name = "p", descriptor = "(FI)V")
	public abstract void method23156(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!zs", name = "y", descriptor = "(Lclient!ia;Lclient!ow;IIFI)V")
	public abstract void method23157(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!zs", name = "z", descriptor = "()Lclient!oo;")
	public abstract Class447 method23158();

	@OriginalMember(owner = "client!zs", name = "t", descriptor = "(F)V")
	public abstract void method23159(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!zs", name = "g", descriptor = "()Lclient!oo;")
	public abstract Class447 method23160();

	@OriginalMember(owner = "client!zs", name = "x", descriptor = "(F)V")
	public abstract void method23161(@OriginalArg(0) float arg0);

	@OriginalMember(owner = "client!zs", name = "d", descriptor = "()Z")
	public abstract boolean method23162();

	@OriginalMember(owner = "client!zs", name = "s", descriptor = "(Lclient!ia;Lclient!ow;IIF)V")
	public abstract void method23163(@OriginalArg(0) Class315 arg0, @OriginalArg(1) Class455 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) float arg4);

	@OriginalMember(owner = "client!zs", name = "r", descriptor = "()Lclient!oo;")
	public abstract Class447 method23164();

	@OriginalMember(owner = "client!zs", name = "l", descriptor = "(I)Lclient!oo;")
	public abstract Class447 method23165();

	@OriginalMember(owner = "client!zs", name = "j", descriptor = "()Lclient!oo;")
	public abstract Class447 method23166();

	@OriginalMember(owner = "client!zs", name = "i", descriptor = "()Lclient!oo;")
	public abstract Class447 method23167();

	@OriginalMember(owner = "client!zs", name = "k", descriptor = "(Lclient!akv;)V")
	public abstract void method23168(@OriginalArg(0) Class77_Sub39 arg0);
}
