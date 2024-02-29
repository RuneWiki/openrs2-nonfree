package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public interface Interface15 {

	@OriginalMember(owner = "client!ca", name = "c", descriptor = "()J")
	long method1831();

	@OriginalMember(owner = "client!ca", name = "v", descriptor = "(I[BI)V")
	void method1832(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ca", name = "p", descriptor = "()I")
	int method1833();

	@OriginalMember(owner = "client!ca", name = "l", descriptor = "()I")
	int method1834();

	@OriginalMember(owner = "client!ca", name = "y", descriptor = "()J")
	long method1835();

	@OriginalMember(owner = "client!ca", name = "w", descriptor = "()J")
	long method1836();

	@OriginalMember(owner = "client!ca", name = "t", descriptor = "(I[BI)V")
	void method1837(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);

	@OriginalMember(owner = "client!ca", name = "q", descriptor = "(I[BI)V")
	void method1838(@OriginalArg(1) byte[] arg0, @OriginalArg(2) int arg1);
}
