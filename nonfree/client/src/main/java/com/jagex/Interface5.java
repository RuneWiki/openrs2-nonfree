package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public interface Interface5 {

	@OriginalMember(owner = "client!bu", name = "h", descriptor = "()I")
	int method974();

	@OriginalMember(owner = "client!bu", name = "a", descriptor = "()I")
	int method975();

	@OriginalMember(owner = "client!bu", name = "g", descriptor = "()J")
	long method976();

	@OriginalMember(owner = "client!bu", name = "l", descriptor = "(I[BI)V")
	void method977(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bu", name = "s", descriptor = "()J")
	long method978();

	@OriginalMember(owner = "client!bu", name = "x", descriptor = "()I")
	int method979();

	@OriginalMember(owner = "client!bu", name = "u", descriptor = "(I[BI)V")
	void method980(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2);

	@OriginalMember(owner = "client!bu", name = "p", descriptor = "()I")
	int method981();
}
