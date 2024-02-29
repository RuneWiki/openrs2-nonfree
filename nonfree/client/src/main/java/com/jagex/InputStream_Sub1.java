package com.jagex;

import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aok")
public class InputStream_Sub1 extends InputStream {

	@OriginalMember(owner = "client!aok", name = "l", descriptor = "(Lclient!ot;B)F", line = 36)
	public static float method17776(@OriginalArg(0) Class452 arg0) {
		@Pc(4) Class447 local4 = Class447.method29120(0.0F, 0.0F, 1.0F);
		local4.method29198(arg0);
		@Pc(15) double local15 = Math.atan2((double) local4.aFloat277, (double) local4.aFloat278);
		local4.method29130();
		if (local15 < 0.0D) {
			local15 = local15 + 3.141592653589793D + 3.141592653589793D;
		}
		return (float) local15;
	}

	@OriginalMember(owner = "client!aok", name = "<init>", descriptor = "()V", line = 296)
	InputStream_Sub1() {
	}

	@OriginalMember(owner = "client!aok", name = "read", descriptor = "()I", line = 299)
	@Override
	public int read() {
		Class281.method26679(30000L);
		return -1;
	}

	@OriginalMember(owner = "client!aok", name = "p", descriptor = "()I", line = 299)
	public int method17777() {
		Class281.method26679(30000L);
		return -1;
	}
}
