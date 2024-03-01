package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public abstract class Class31 {

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_18;

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "Lclient!ic;")
	public Interface20 anInterface20_19;

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "I")
	public int anInt884;

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "Lclient!if;")
	public Interface21 anInterface21_9;

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "Lclient!iy;")
	public Class37 aClass37_10;

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "Lclient!mq;")
	public final Class328 aClass328_51 = new Class328();

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "Lclient!mq;")
	public final Class328 aClass328_53 = new Class328();

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "Lclient!mq;")
	public final Class328 aClass328_52 = new Class328();

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "Lclient!abv;")
	protected Class21_Sub3 aClass21_Sub3_22;

	@OriginalMember(owner = "client!hr", name = "<init>", descriptor = "(Lclient!abv;)V", line = 18)
	Class31(@OriginalArg(0) Class21_Sub3 arg0) {
		this.aClass21_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!hr", name = "z", descriptor = "()V")
	public abstract void method8269();

	@OriginalMember(owner = "client!hr", name = "a", descriptor = "()V")
	public abstract void method8270();

	@OriginalMember(owner = "client!hr", name = "h", descriptor = "(II)V")
	public abstract void method8271(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hr", name = "g", descriptor = "()V")
	public abstract void method8272();

	@OriginalMember(owner = "client!hr", name = "l", descriptor = "(II)V")
	public abstract void method8273(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hr", name = "p", descriptor = "(II)V")
	public abstract void method8274(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!hr", name = "s", descriptor = "()V")
	public abstract void method8275();

	@OriginalMember(owner = "client!hr", name = "u", descriptor = "()V")
	public abstract void method8276();

	@OriginalMember(owner = "client!hr", name = "y", descriptor = "()V")
	public abstract void method8277();

	@OriginalMember(owner = "client!hr", name = "x", descriptor = "()V")
	public abstract void method8278();

	@OriginalMember(owner = "client!hr", name = "c", descriptor = "()V")
	public abstract void method8279();

	@OriginalMember(owner = "client!hr", name = "b", descriptor = "()V")
	public abstract void method8280();
}
