package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public abstract class Class103 {

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_19;

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "I")
	public int anInt1094;

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_20;

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "Lclient!kp;")
	public Interface36 anInterface36_9;

	@OriginalMember(owner = "client!jk", name = "x", descriptor = "Lclient!kt;")
	public Class113 aClass113_10;

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "Lclient!oi;")
	public final Class442 aClass442_52 = new Class442();

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "Lclient!oi;")
	public final Class442 aClass442_50 = new Class442();

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "Lclient!oi;")
	public final Class442 aClass442_51 = new Class442();

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "Lclient!aed;")
	protected Class86_Sub1 aClass86_Sub1_17;

	@OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lclient!aed;)V", line = 18)
	Class103(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_17 = arg0;
	}

	@OriginalMember(owner = "client!jk", name = "w", descriptor = "()V")
	public abstract void method9176();

	@OriginalMember(owner = "client!jk", name = "p", descriptor = "(II)V")
	public abstract void method9177(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "q", descriptor = "(II)V")
	public abstract void method9178(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!jk", name = "c", descriptor = "()V")
	public abstract void method9179();

	@OriginalMember(owner = "client!jk", name = "l", descriptor = "()V")
	public abstract void method9180();

	@OriginalMember(owner = "client!jk", name = "y", descriptor = "()V")
	public abstract void method9181();

	@OriginalMember(owner = "client!jk", name = "v", descriptor = "()V")
	public abstract void method9182();

	@OriginalMember(owner = "client!jk", name = "t", descriptor = "(II)V")
	public abstract void method9183(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);
}
