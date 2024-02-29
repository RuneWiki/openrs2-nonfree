package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qx")
public interface Interface57 {

	@OriginalMember(owner = "client!qx", name = "p", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;I)V")
	void method26203(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!qx", name = "c", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26204(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);

	@OriginalMember(owner = "client!qx", name = "v", descriptor = "(Ljava/lang/Object;[F[Ljava/lang/Object;)V")
	void method26205(@OriginalArg(0) Object arg0, @OriginalArg(1) float[] arg1, @OriginalArg(2) Object[] arg2);
}
