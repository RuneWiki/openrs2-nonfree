package com.jagex;

import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!abd")
public class Class30 {

	@OriginalMember(owner = "client!abd", name = "<init>", descriptor = "()V", line = 6)
	public Class30() {
		System.nanoTime();
	}

	@OriginalMember(owner = "client!abd", name = "p", descriptor = "(I)J", line = 11)
	public long method506() {
		return System.nanoTime();
	}
}
