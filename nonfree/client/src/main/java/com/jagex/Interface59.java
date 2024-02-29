package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rp")
public interface Interface59 {

	@OriginalMember(owner = "client!rp", name = "c", descriptor = "(Ljava/lang/String;I)Z")
	boolean method30918(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rp", name = "y", descriptor = "(Ljava/lang/String;)V")
	void method30919(@OriginalArg(0) String arg0) throws Exception_Sub4;

	@OriginalMember(owner = "client!rp", name = "l", descriptor = "(Ljava/lang/String;)V")
	void method30920(@OriginalArg(0) String arg0) throws Exception_Sub4;

	@OriginalMember(owner = "client!rp", name = "p", descriptor = "(Ljava/lang/String;I)V")
	void method30921(@OriginalArg(0) String arg0) throws Exception_Sub4;

	@OriginalMember(owner = "client!rp", name = "q", descriptor = "(Ljava/lang/String;)Z")
	boolean method30922(@OriginalArg(0) String arg0);

	@OriginalMember(owner = "client!rp", name = "w", descriptor = "()Z")
	boolean method30923();

	@OriginalMember(owner = "client!rp", name = "t", descriptor = "()Z")
	boolean method30924();

	@OriginalMember(owner = "client!rp", name = "v", descriptor = "(S)Z")
	boolean method30925();

	@OriginalMember(owner = "client!rp", name = "x", descriptor = "(Ljava/lang/String;)Z")
	boolean method30926(@OriginalArg(0) String arg0);
}
