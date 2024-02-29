package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public interface Interface12 {

	@OriginalMember(owner = "client!am", name = "l", descriptor = "(Lclient!akv;)V")
	void method36030(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!am", name = "p", descriptor = "(Lclient!akv;B)V")
	void method36031(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!am", name = "v", descriptor = "(Lclient!akv;)V")
	void method36032(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!am", name = "y", descriptor = "(Lclient!akv;)V")
	void method36033(@OriginalArg(0) Class77_Sub39 arg0);

	@OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
	void method36034();

	@OriginalMember(owner = "client!am", name = "w", descriptor = "()V")
	void method36035();

	@OriginalMember(owner = "client!am", name = "t", descriptor = "()V")
	void method36036();
}
