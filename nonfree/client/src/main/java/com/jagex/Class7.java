package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public abstract class Class7 {

	@OriginalMember(owner = "client!br", name = "p", descriptor = "Lclient!abt;")
	final Class21_Sub2 aClass21_Sub2_22;

	@OriginalMember(owner = "client!br", name = "<init>", descriptor = "(Lclient!abt;)V", line = 7)
	Class7(@OriginalArg(0) Class21_Sub2 arg0) {
		this.aClass21_Sub2_22 = arg0;
	}

	@OriginalMember(owner = "client!br", name = "l", descriptor = "()V")
	abstract void method1221();

	@OriginalMember(owner = "client!br", name = "p", descriptor = "()Z")
	abstract boolean method1222();

	@OriginalMember(owner = "client!br", name = "a", descriptor = "(Z)V")
	abstract void method1223(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!br", name = "g", descriptor = "(Z)V")
	abstract void method1224(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!br", name = "c", descriptor = "(Z)V")
	abstract void method1225(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!br", name = "s", descriptor = "()Z")
	abstract boolean method1226();

	@OriginalMember(owner = "client!br", name = "x", descriptor = "(Lclient!bf;I)V")
	abstract void method1227(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!br", name = "z", descriptor = "(Z)V")
	abstract void method1228(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!br", name = "n", descriptor = "()V")
	abstract void method1229();

	@OriginalMember(owner = "client!br", name = "y", descriptor = "()Z")
	abstract boolean method1230();

	@OriginalMember(owner = "client!br", name = "b", descriptor = "(Z)V")
	abstract void method1231(@OriginalArg(0) boolean arg0);

	@OriginalMember(owner = "client!br", name = "h", descriptor = "(II)V")
	abstract void method1232(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!br", name = "u", descriptor = "()Z")
	abstract boolean method1233();

	@OriginalMember(owner = "client!br", name = "j", descriptor = "(Z)V")
	abstract void method1234();

	@OriginalMember(owner = "client!br", name = "m", descriptor = "(II)V")
	abstract void method1235(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!br", name = "e", descriptor = "()V")
	abstract void method1236();

	@OriginalMember(owner = "client!br", name = "r", descriptor = "()V")
	abstract void method1237();

	@OriginalMember(owner = "client!br", name = "d", descriptor = "()V")
	abstract void method1238();

	@OriginalMember(owner = "client!br", name = "q", descriptor = "()V")
	abstract void method1239();

	@OriginalMember(owner = "client!br", name = "v", descriptor = "(Lclient!bf;I)V")
	abstract void method1240(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!br", name = "t", descriptor = "(Lclient!bf;I)V")
	abstract void method1241(@OriginalArg(0) Class4 arg0, @OriginalArg(1) int arg1);
}
