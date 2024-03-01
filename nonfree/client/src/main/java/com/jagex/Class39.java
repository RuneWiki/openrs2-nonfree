package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public abstract class Class39 {

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_17;

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "I")
	public int anInt883;

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "Lclient!mq;")
	public final Class328 aClass328_49 = new Class328();

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "Lclient!mv;")
	public final Class333 aClass333_11 = new Class333();

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "Lclient!mh;")
	public final Class320 aClass320_44 = new Class320();

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "F")
	public float aFloat134 = 0.0F;

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "Lclient!abv;")
	protected Class21_Sub3 aClass21_Sub3_21;

	@OriginalMember(owner = "client!hw", name = "<init>", descriptor = "(Lclient!abv;)V", line = 18)
	Class39(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_21 = arg0;
	}

	@OriginalMember(owner = "client!hw", name = "u", descriptor = "(Z)V")
	public abstract void method8253(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hw", name = "p", descriptor = "(Lclient!mq;)V")
	public abstract void method8254(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!hw", name = "g", descriptor = "(Z)V")
	public abstract void method8255(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!hw", name = "l", descriptor = "(Lclient!mq;)V")
	public abstract void method8256(@OriginalArg(0) Class328 arg0);

	@OriginalMember(owner = "client!hw", name = "s", descriptor = "(IZ)V")
	public abstract void method8257(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!hw", name = "x", descriptor = "(IZ)V")
	public abstract void method8258(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!hw", name = "a", descriptor = "(IZ)V")
	public abstract void method8259(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!hw", name = "h", descriptor = "(IZ)V")
	public abstract void method8260(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);
}
