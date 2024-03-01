package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public interface Interface24 {

	@OriginalMember(owner = "client!je", name = "z", descriptor = "()I")
	int method25704();

	@OriginalMember(owner = "client!je", name = "h", descriptor = "(IIJ)Z")
	boolean method25705(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!je", name = "u", descriptor = "()I")
	int method25706();

	@OriginalMember(owner = "client!je", name = "s", descriptor = "()V")
	void method25707();

	@OriginalMember(owner = "client!je", name = "r", descriptor = "(II)J")
	long method25708(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!je", name = "l", descriptor = "()I")
	int method25709();

	@OriginalMember(owner = "client!je", name = "x", descriptor = "(II)J")
	long method25710(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!je", name = "j", descriptor = "(IIJ)Z")
	boolean method25711(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!je", name = "n", descriptor = "(IIJ)Z")
	boolean method25712(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) long arg2);

	@OriginalMember(owner = "client!je", name = "e", descriptor = "(II)J")
	long method25713(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1);

	@OriginalMember(owner = "client!je", name = "c", descriptor = "()I")
	int method25714();

	@OriginalMember(owner = "client!je", name = "d", descriptor = "()V")
	void method25715();

	@OriginalMember(owner = "client!je", name = "q", descriptor = "()V")
	void method25716();
}
