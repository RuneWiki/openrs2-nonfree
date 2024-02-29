package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public interface Interface38 extends Interface33, Interface35 {

	@OriginalMember(owner = "client!lc", name = "s", descriptor = "()V")
	void method30320();

	@OriginalMember(owner = "client!lc", name = "p", descriptor = "()Lclient!dl;")
	Class206 method28727();

	@OriginalMember(owner = "client!lc", name = "o", descriptor = "(I)V")
	void method28728(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!lc", name = "v", descriptor = "()V")
	void method30322();

	@OriginalMember(owner = "client!lc", name = "r", descriptor = "()V")
	void method30321();

	@OriginalMember(owner = "client!lc", name = "g", descriptor = "()V")
	void method30319();

	@OriginalMember(owner = "client!lc", name = "c", descriptor = "()Lclient!dl;")
	Class206 method28729();

	@OriginalMember(owner = "client!lc", name = "b", descriptor = "(I)V")
	void method28730(@OriginalArg(0) int arg0);
}
