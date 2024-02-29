package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class Class76 {

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "Lclient!aeq;")
	final Class86_Sub3 aClass86_Sub3_22;

	@OriginalMember(owner = "client!bs", name = "<init>", descriptor = "(Lclient!aeq;)V", line = 7)
	Class76(@OriginalArg(0) Class86_Sub3 arg0) {
		this.aClass86_Sub3_22 = arg0;
	}

	@OriginalMember(owner = "client!bs", name = "e", descriptor = "()V")
	abstract void method1974();

	@OriginalMember(owner = "client!bs", name = "l", descriptor = "()V")
	abstract void method1975();

	@OriginalMember(owner = "client!bs", name = "c", descriptor = "(Z)V")
	abstract void method1976(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "v", descriptor = "(Z)V")
	abstract void method1977(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "b", descriptor = "(II)V")
	abstract void method1978(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "y", descriptor = "(II)V")
	abstract void method1979(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "k", descriptor = "(Z)V")
	abstract void method1980();

	@OriginalMember(owner = "client!bs", name = "q", descriptor = "()Z")
	abstract boolean method1981();

	@OriginalMember(owner = "client!bs", name = "x", descriptor = "()Z")
	abstract boolean method1982();

	@OriginalMember(owner = "client!bs", name = "d", descriptor = "(Z)V")
	abstract void method1983(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "i", descriptor = "(Z)V")
	abstract void method1984();

	@OriginalMember(owner = "client!bs", name = "r", descriptor = "(Z)V")
	abstract void method1985(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "g", descriptor = "(Z)V")
	abstract void method1986(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "z", descriptor = "(Z)V")
	abstract void method1987();

	@OriginalMember(owner = "client!bs", name = "j", descriptor = "(Z)V")
	abstract void method1988();

	@OriginalMember(owner = "client!bs", name = "u", descriptor = "()V")
	abstract void method1989();

	@OriginalMember(owner = "client!bs", name = "t", descriptor = "()Z")
	abstract boolean method1990();

	@OriginalMember(owner = "client!bs", name = "w", descriptor = "(Lclient!bx;I)V")
	abstract void method1991(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "s", descriptor = "(Z)V")
	abstract void method1992(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!bs", name = "f", descriptor = "()V")
	abstract void method1993();

	@OriginalMember(owner = "client!bs", name = "o", descriptor = "(II)V")
	abstract void method1994(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!bs", name = "p", descriptor = "()Z")
	abstract boolean method1995();

	@OriginalMember(owner = "client!bs", name = "n", descriptor = "(Lclient!bx;I)V")
	abstract void method1996(@OriginalArg(0) Class78 arg0, @OriginalArg(1) int arg1);
}
