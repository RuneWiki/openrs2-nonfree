package com.jagex;

import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqd")
public class Class77_Sub2_Sub1 extends Class77_Sub2 {

	@OriginalMember(owner = "client!aqd", name = "l", descriptor = "Lclient!jaclib/memory/heap/NativeHeap;")
	NativeHeap aNativeHeap5;

	@OriginalMember(owner = "client!aqd", name = "<init>", descriptor = "(I)V", line = 9)
	Class77_Sub2_Sub1(@OriginalArg(0) int arg0) {
		this.aNativeHeap5 = new NativeHeap(arg0);
	}

	@OriginalMember(owner = "client!aqd", name = "c", descriptor = "()V", line = 14)
	void method21398() {
		this.aNativeHeap5.v();
	}

	@OriginalMember(owner = "client!aqd", name = "v", descriptor = "()V", line = 14)
	void method21399() {
		this.aNativeHeap5.v();
	}

	@OriginalMember(owner = "client!aqd", name = "p", descriptor = "()V", line = 14)
	void method21400() {
		this.aNativeHeap5.v();
	}
}
