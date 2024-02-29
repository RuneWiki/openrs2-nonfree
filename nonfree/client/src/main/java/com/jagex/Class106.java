package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public abstract class Class106 {

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "Lclient!ks;")
	public Interface37 anInterface37_15;

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "I")
	public int anInt1046;

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "Lclient!oi;")
	public final Class442 aClass442_41 = new Class442();

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "Lclient!or;")
	public final Class450 aClass450_5 = new Class450();

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "Lclient!oo;")
	public final Class447 aClass447_16 = new Class447();

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "F")
	public float aFloat118 = 0.0F;

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "Lclient!aed;")
	protected Class86_Sub1 aClass86_Sub1_13;

	@OriginalMember(owner = "client!jn", name = "<init>", descriptor = "(Lclient!aed;)V", line = 18)
	Class106(@OriginalArg(0) Class86_Sub1 arg0) {
		this.aClass86_Sub1_13 = arg0;
	}

	@OriginalMember(owner = "client!jn", name = "y", descriptor = "(Lclient!oi;)V")
	public abstract void method8967(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jn", name = "x", descriptor = "(IZ)V")
	public abstract void method8968(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jn", name = "p", descriptor = "(Lclient!oi;)V")
	public abstract void method8969(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jn", name = "v", descriptor = "(Z)V")
	public abstract void method8970(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!jn", name = "c", descriptor = "(IZ)V")
	public abstract void method8971(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jn", name = "l", descriptor = "(Lclient!oi;)V")
	public abstract void method8972(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jn", name = "w", descriptor = "(Lclient!oi;)V")
	public abstract void method8973(@OriginalArg(0) Class442 arg0);

	@OriginalMember(owner = "client!jn", name = "t", descriptor = "(IZ)V")
	public abstract void method8974(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jn", name = "q", descriptor = "(IZ)V")
	public abstract void method8975(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1);

	@OriginalMember(owner = "client!jn", name = "d", descriptor = "(Z)V")
	public abstract void method8976(@OriginalArg(0) boolean arg0);
}
