package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hn")
public abstract class Class32 {

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "I")
	static final int anInt840 = 4;

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "F")
	protected float aFloat120;

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "Lclient!jk;")
	public Interface27 anInterface27_3;

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "I")
	public int anInt841;

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "F")
	protected float aFloat121;

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "I")
	public int anInt842;

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_14;

	@OriginalMember(owner = "client!hn", name = "w", descriptor = "I")
	public int anInt843;

	@OriginalMember(owner = "client!hn", name = "o", descriptor = "I")
	public int anInt844;

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "[F")
	public float[] aFloatArray49 = new float[16];

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "[F")
	public float[] aFloatArray50 = new float[16];

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "Lclient!mq;")
	public final Class328 aClass328_44 = new Class328();

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "Lclient!mh;")
	public final Class320 aClass320_32 = new Class320();

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "Lclient!mv;")
	public final Class333 aClass333_7 = new Class333();

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "Lclient!mh;")
	public final Class320 aClass320_33 = new Class320();

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "Lclient!mv;")
	public final Class333 aClass333_8 = new Class333();

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "Lclient!mh;")
	public final Class320 aClass320_31 = new Class320();

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "Lclient!mh;")
	public final Class320 aClass320_34 = new Class320();

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "Lclient!mh;")
	public final Class320 aClass320_35 = new Class320();

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "Lclient!mh;")
	public final Class320 aClass320_36 = new Class320();

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "Lclient!mh;")
	public final Class320 aClass320_37 = new Class320();

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "Lclient!mq;")
	public final Class328 aClass328_45 = new Class328();

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "Lclient!abv;")
	protected Class21_Sub3 aClass21_Sub3_12;

	@OriginalMember(owner = "client!hn", name = "<init>", descriptor = "(Lclient!abv;)V", line = 32)
	Class32(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_12 = arg0;
	}

	@OriginalMember(owner = "client!hn", name = "p", descriptor = "(B)V", line = 37)
	public void method7773(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat120 = 32.0F;
				this.aFloat121 = 0.0F;
				break;
			case 2:
				this.aFloat120 = 4.0F;
				this.aFloat121 = 0.0F;
				break;
			case 3:
				this.aFloat120 = 1.0F;
				this.aFloat121 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!hn", name = "t", descriptor = "(B)V", line = 37)
	public void method7777(@OriginalArg(0) byte arg0) {
		switch(arg0) {
			case 1:
				this.aFloat120 = 32.0F;
				this.aFloat121 = 0.0F;
				break;
			case 2:
				this.aFloat120 = 4.0F;
				this.aFloat121 = 0.0F;
				break;
			case 3:
				this.aFloat120 = 1.0F;
				this.aFloat121 = 0.0F;
		}
	}

	@OriginalMember(owner = "client!hn", name = "x", descriptor = "(I)V")
	public abstract void method7772(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "a", descriptor = "(Lclient!mq;)V")
	public abstract void method7774(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!hn", name = "g", descriptor = "(Z)V")
	public abstract void method7775(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hn", name = "z", descriptor = "(Z)V")
	public abstract void method7776(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hn", name = "s", descriptor = "()V")
	public abstract void method7778();

	@OriginalMember(owner = "client!hn", name = "u", descriptor = "()V")
	public abstract void method7779();

	@OriginalMember(owner = "client!hn", name = "y", descriptor = "(Lclient!mq;)V")
	public abstract void method7780(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!hn", name = "b", descriptor = "(Z)V")
	public abstract void method7781(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hn", name = "c", descriptor = "(Z)V")
	public abstract void method7782(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hn", name = "v", descriptor = "()V")
	public abstract void method7783();

	@OriginalMember(owner = "client!hn", name = "l", descriptor = "(I)V")
	public abstract void method7784(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "n", descriptor = "(I)V")
	public abstract void method7785(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "h", descriptor = "(I)V")
	public abstract void method7786(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "r", descriptor = "(I)V")
	public abstract void method7787(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "d", descriptor = "(I)V")
	public abstract void method7788(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "q", descriptor = "(I)V")
	public abstract void method7789(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "m", descriptor = "()V")
	public abstract void method7790();

	@OriginalMember(owner = "client!hn", name = "e", descriptor = "(I)V")
	public abstract void method7791(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!hn", name = "j", descriptor = "(I)V")
	public abstract void method7792(@OriginalArg(0) int arg0);
}
