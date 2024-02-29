package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class Class109 {

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
	static final int anInt1088 = 4;

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
	public int anInt1087;

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_18;

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "Lclient!le;")
	public Interface40 anInterface40_3;

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "F")
	protected float aFloat123;

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "F")
	protected float aFloat124;

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
	public int anInt1089;

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
	public int anInt1090;

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
	public int anInt1091;

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "[F")
	public float[] aFloatArray47 = new float[16];

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "[F")
	public float[] aFloatArray48 = new float[16];

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "Lclient!oi;")
	public final Class442 aClass442_48 = new Class442();

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "Lclient!oo;")
	public final Class447 aClass447_32 = new Class447();

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "Lclient!or;")
	public final Class450 aClass450_10 = new Class450();

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "Lclient!oo;")
	public final Class447 aClass447_31 = new Class447();

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "Lclient!or;")
	public final Class450 aClass450_11 = new Class450();

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "Lclient!oo;")
	public final Class447 aClass447_33 = new Class447();

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "Lclient!oo;")
	public final Class447 aClass447_34 = new Class447();

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "Lclient!oo;")
	public final Class447 aClass447_35 = new Class447();

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "Lclient!oo;")
	public final Class447 aClass447_36 = new Class447();

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "Lclient!oo;")
	public final Class447 aClass447_37 = new Class447();

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "Lclient!oi;")
	public final Class442 aClass442_49 = new Class442();

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "Lclient!aed;")
	protected Class86_Sub1 aClass86_Sub1_16;

	@OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lclient!aed;)V", line = 32)
	Class109(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_16 = arg0;
	}

	@OriginalMember(owner = "client!jo", name = "p", descriptor = "(B)V", line = 37)
	public void method9097(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat123 = 32.0F;
				this.aFloat124 = 0.0F;
				break;
			case 2:
				this.aFloat123 = 4.0F;
				this.aFloat124 = 0.0F;
				break;
			case 3:
				this.aFloat123 = 1.0F;
				this.aFloat124 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!jo", name = "o", descriptor = "(B)V", line = 37)
	public void method9098(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat123 = 32.0F;
				this.aFloat124 = 0.0F;
				break;
			case 2:
				this.aFloat123 = 4.0F;
				this.aFloat124 = 0.0F;
				break;
			case 3:
				this.aFloat123 = 1.0F;
				this.aFloat124 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!jo", name = "f", descriptor = "(B)V", line = 37)
	public void method9099(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat123 = 32.0F;
				this.aFloat124 = 0.0F;
				break;
			case 2:
				this.aFloat123 = 4.0F;
				this.aFloat124 = 0.0F;
				break;
			case 3:
				this.aFloat123 = 1.0F;
				this.aFloat124 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!jo", name = "e", descriptor = "()V")
	public abstract void method9100();

	@OriginalMember(owner = "client!jo", name = "c", descriptor = "(Lclient!oi;)V")
	public abstract void method9101(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jo", name = "u", descriptor = "()V")
	public abstract void method9102();

	@OriginalMember(owner = "client!jo", name = "l", descriptor = "(I)V")
	public abstract void method9103(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "g", descriptor = "(I)V")
	public abstract void method9104(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "t", descriptor = "()V")
	public abstract void method9105();

	@OriginalMember(owner = "client!jo", name = "q", descriptor = "()V")
	public abstract void method9106();

	@OriginalMember(owner = "client!jo", name = "x", descriptor = "(Lclient!oi;)V")
	public abstract void method9107(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jo", name = "d", descriptor = "(Lclient!oi;)V")
	public abstract void method9108(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jo", name = "s", descriptor = "(Z)V")
	public abstract void method9109(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "r", descriptor = "(Z)V")
	public abstract void method9110(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "w", descriptor = "(I)V")
	public abstract void method9111(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "z", descriptor = "(I)V")
	public abstract void method9112(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "j", descriptor = "(I)V")
	public abstract void method9113(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "i", descriptor = "(I)V")
	public abstract void method9114(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "k", descriptor = "()V")
	public abstract void method9115();

	@OriginalMember(owner = "client!jo", name = "y", descriptor = "(I)V")
	public abstract void method9116(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "v", descriptor = "(Z)V")
	public abstract void method9117(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)V")
	public abstract void method9118(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "n", descriptor = "(I)V")
	public abstract void method9119(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
	public abstract void method9120(@OriginalArg(0) int arg0);
}
