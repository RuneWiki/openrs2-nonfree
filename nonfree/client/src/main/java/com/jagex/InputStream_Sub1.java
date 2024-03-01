package com.jagex;

import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajh")
public class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!ajh", name = "<init>", descriptor = "()V", line = 294)
	InputStream_Sub1() {
	}

	@OriginalMember(owner = "client!ajh", name = "p", descriptor = "()I", line = 297)
	public int method14431() {
		Class60_Sub11.method13407(30000L);
		return -1;
	}

	@OriginalMember(owner = "client!ajh", name = "read", descriptor = "()I", line = 297)
	@Override
	public int read() {
		Class60_Sub11.method13407(30000L);
		return -1;
	}

	@OriginalMember(owner = "client!ajh", name = "a", descriptor = "()I", line = 297)
	public int method14432() {
		Class60_Sub11.method13407(30000L);
		return -1;
	}

	@OriginalMember(owner = "client!ajh", name = "g", descriptor = "()I", line = 297)
	public int method14433() {
		Class60_Sub11.method13407(30000L);
		return -1;
	}
}
