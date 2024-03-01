package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jw")
public interface Interface30 extends Interface24, Interface22 {

	@OriginalMember(owner = "client!jw", name = "m", descriptor = "(I)V")
	void method25720(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jw", name = "b", descriptor = "()V")
	void method27210();

	@OriginalMember(owner = "client!jw", name = "g", descriptor = "()V")
	void method27209();

	@OriginalMember(owner = "client!jw", name = "y", descriptor = "()V")
	void method27208();

	@OriginalMember(owner = "client!jw", name = "p", descriptor = "()Lclient!dj;")
	Class127 method25721();

	@OriginalMember(owner = "client!jw", name = "a", descriptor = "()Lclient!dj;")
	Class127 method25722();

	@OriginalMember(owner = "client!jw", name = "v", descriptor = "(I)V")
	void method25723(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jw", name = "t", descriptor = "(I)V")
	void method25724(@OriginalArg(0) int arg0);

	@OriginalMember(owner = "client!jw", name = "w", descriptor = "(I)V")
	void method25725(@OriginalArg(0) int arg0);
}
