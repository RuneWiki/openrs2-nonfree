package com.jagex;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!jy")
public class Class353 implements Interface31 {

	@OriginalMember(owner = "client!jy", name = "p", descriptor = "Lclient!mw;")
	final Class409 aClass409_1;

	@OriginalMember(owner = "client!jy", name = "c", descriptor = "Lclient!je;")
	final Class340 aClass340_2;

	@OriginalMember(owner = "client!jy", name = "<init>", descriptor = "(Lclient!je;Lclient!mw;)V", line = 13)
	Class353(@OriginalArg(0) Class340 arg0, @OriginalArg(1) Class409 arg1) {
		this.aClass409_1 = arg1;
		this.aClass340_2 = arg0;
	}

	@OriginalMember(owner = "client!jy", name = "v", descriptor = "(I)Z", line = 19)
	@Override
	public boolean method27915() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "d", descriptor = "()Z", line = 19)
	@Override
	public boolean method27922() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "t", descriptor = "()Z", line = 19)
	@Override
	public boolean method27924() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "q", descriptor = "()Z", line = 19)
	@Override
	public boolean method27916() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "x", descriptor = "()Z", line = 19)
	@Override
	public boolean method27923() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "w", descriptor = "()Z", line = 19)
	@Override
	public boolean method27920() {
		return this.aClass340_2.method27741();
	}

	@OriginalMember(owner = "client!jy", name = "p", descriptor = "(S)V", line = 22)
	@Override
	public void method27917() {
	}

	@OriginalMember(owner = "client!jy", name = "y", descriptor = "()V", line = 22)
	@Override
	public void method27919() {
	}

	@OriginalMember(owner = "client!jy", name = "c", descriptor = "(ZB)V", line = 25)
	@Override
	public void method27921(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class338 local9 = this.aClass340_2.method27738(this.aClass409_1.anInt4713 * -644775195);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass409_1.aClass410_11.method28569(this.aClass409_1.anInt4707 * -1629800665, client.anInt3394 * -321474631) + this.aClass409_1.anInt4711 * -940612791;
		@Pc(52) int local52 = this.aClass409_1.aClass402_14.method28502(this.aClass409_1.anInt4714 * -1902641631, client.anInt3464 * 43072843) + this.aClass409_1.anInt4708 * -1180497457;
		if (this.aClass409_1.aBoolean744) {
			Class284.aClass86_9.method20087(local32, local52, this.aClass409_1.anInt4707 * -1629800665, this.aClass409_1.anInt4714 * -1902641631, this.aClass409_1.anInt4712 * -89067315, 0);
		}
		local52 += this.method27925(Class260.aClass94_8, local9.aString205, local32, local52, 5) * 12;
		local52 += 8;
		if (this.aClass409_1.aBoolean744) {
			Class284.aClass86_9.method20092(local32, local52, local32 + this.aClass409_1.anInt4707 * -1629800665 - 1, local52, this.aClass409_1.anInt4712 * -89067315, 0);
		}
		local52++;
		local52 += this.method27925(Class260.aClass94_8, local9.aString203, local32, local52, 5) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method27925(Class260.aClass94_8, local9.aString204, local32, local52, 5) * 12;
	}

	@OriginalMember(owner = "client!jy", name = "l", descriptor = "(Z)V", line = 25)
	@Override
	public void method27918(@OriginalArg(0) boolean arg0) {
		@Pc(9) Class338 local9 = this.aClass340_2.method27738(this.aClass409_1.anInt4713 * -644775195);
		if (local9 == null) {
			return;
		}
		@Pc(32) int local32 = this.aClass409_1.aClass410_11.method28569(this.aClass409_1.anInt4707 * -1629800665, client.anInt3394 * -321474631) + this.aClass409_1.anInt4711 * -940612791;
		@Pc(52) int local52 = this.aClass409_1.aClass402_14.method28502(this.aClass409_1.anInt4714 * -1902641631, client.anInt3464 * 43072843) + this.aClass409_1.anInt4708 * -1180497457;
		if (this.aClass409_1.aBoolean744) {
			Class284.aClass86_9.method20087(local32, local52, this.aClass409_1.anInt4707 * -1629800665, this.aClass409_1.anInt4714 * -1902641631, this.aClass409_1.anInt4712 * -89067315, 0);
		}
		local52 += this.method27925(Class260.aClass94_8, local9.aString205, local32, local52, 5) * 12;
		local52 += 8;
		if (this.aClass409_1.aBoolean744) {
			Class284.aClass86_9.method20092(local32, local52, local32 + this.aClass409_1.anInt4707 * -1629800665 - 1, local52, this.aClass409_1.anInt4712 * -89067315, 0);
		}
		local52++;
		local52 += this.method27925(Class260.aClass94_8, local9.aString203, local32, local52, 5) * 12;
		local52 += 5;
		@Pc(144) int local144 = local52 + this.method27925(Class260.aClass94_8, local9.aString204, local32, local52, 5) * 12;
	}

	@OriginalMember(owner = "client!jy", name = "s", descriptor = "(Lclient!dj;Ljava/lang/String;IIII)I", line = 41)
	int method27925(@OriginalArg(0) Class94 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method7614(arg1, arg2 + arg4, arg4 + arg3, this.aClass409_1.anInt4707 * -1629800665 - arg4 * 2, this.aClass409_1.anInt4714 * -1902641631 - arg4 * 2, this.aClass409_1.anInt4709 * 1537726007, this.aClass409_1.anInt4710 * 519044141, 0, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!jy", name = "r", descriptor = "(Lclient!dj;Ljava/lang/String;III)I", line = 41)
	int method27926(@OriginalArg(0) Class94 arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		return arg0.method7614(arg1, arg2 + arg4, arg4 + arg3, this.aClass409_1.anInt4707 * -1629800665 - arg4 * 2, this.aClass409_1.anInt4714 * -1902641631 - arg4 * 2, this.aClass409_1.anInt4709 * 1537726007, this.aClass409_1.anInt4710 * 519044141, 0, 0, 0, null, null, null, 0, 0);
	}

	@OriginalMember(owner = "client!jy", name = "q", descriptor = "(B)V", line = 382)
	static void method27927() {
		try {
			@Pc(5) File local5 = new File(Class77_Sub42_Sub2.aString113, "random.dat");
			@Pc(29) int local29;
			if (local5.exists()) {
				Class504.aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			} else {
				label34: for (@Pc(23) int local23 = 0; local23 < Class595.aStringArray33.length; local23++) {
					for (local29 = 0; local29 < Class110.aStringArray17.length; local29++) {
						@Pc(53) File local53 = new File(Class110.aStringArray17[local29] + Class595.aStringArray33[local23] + File.separatorChar + "random.dat");
						if (local53.exists()) {
							Class504.aClass34_4 = new Class34(new Class28(local53, "rw", 25L), 24, 0);
							break label34;
						}
					}
				}
			}
			if (Class504.aClass34_4 == null) {
				@Pc(82) RandomAccessFile local82 = new RandomAccessFile(local5, "rw");
				local29 = local82.read();
				local82.seek(0L);
				local82.write(local29);
				local82.seek(0L);
				local82.close();
				Class504.aClass34_4 = new Class34(new Class28(local5, "rw", 25L), 24, 0);
			}
		} catch (@Pc(110) IOException local110) {
		}
	}

	@OriginalMember(owner = "client!jy", name = "dv", descriptor = "(Lclient!yf;I)V", line = 5053)
	static final void method27928(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class566.method31373(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!jy", name = "abn", descriptor = "(Lclient!yf;I)V", line = 9394)
	static final void method27929(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass497ArrayArray1[local23][local13].anInt5058 * 1065325223;
	}

	@OriginalMember(owner = "client!jy", name = "agg", descriptor = "(Lclient!yf;I)V", line = 10584)
	static final void method27930(@OriginalArg(0) Class665 arg0) {
		Class659.anInt5777 = 0;
	}

	@OriginalMember(owner = "client!jy", name = "aqo", descriptor = "(Lclient!yf;B)V", line = 12371)
	static final void method27931(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub7_1.method15146();
	}
}
