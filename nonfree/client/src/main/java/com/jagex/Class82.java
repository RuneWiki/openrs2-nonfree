package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!av")
public class Class82 {

	@OriginalMember(owner = "client!av", name = "p", descriptor = "I")
	static final int anInt2916 = 15000;

	@OriginalMember(owner = "client!av", name = "m", descriptor = "Lclient!ll;")
	Class301 aClass301_1;

	@OriginalMember(owner = "client!av", name = "x", descriptor = "Lclient!xj;")
	public Class577 aClass577_2;

	@OriginalMember(owner = "client!av", name = "u", descriptor = "Lclient!xj;")
	Class577 aClass577_3;

	@OriginalMember(owner = "client!av", name = "a", descriptor = "Lclient!qg;")
	Class62 aClass62_2;

	@OriginalMember(owner = "client!av", name = "n", descriptor = "I")
	int anInt2920;

	@OriginalMember(owner = "client!av", name = "r", descriptor = "I")
	int anInt2921;

	@OriginalMember(owner = "client!av", name = "d", descriptor = "I")
	int anInt2922;

	@OriginalMember(owner = "client!av", name = "e", descriptor = "I")
	int anInt2923;

	@OriginalMember(owner = "client!av", name = "q", descriptor = "Lclient!ll;")
	Class301 aClass301_3;

	@OriginalMember(owner = "client!av", name = "v", descriptor = "Lclient!ll;")
	Class301 aClass301_4;

	@OriginalMember(owner = "client!av", name = "g", descriptor = "Lclient!wk;")
	Class553 aClass553_41 = new Class553();

	@OriginalMember(owner = "client!av", name = "l", descriptor = "I")
	public int anInt2917 = 0;

	@OriginalMember(owner = "client!av", name = "h", descriptor = "Lclient!ahb;")
	Class3_Sub41 aClass3_Sub41_15 = new Class3_Sub41(1700);

	@OriginalMember(owner = "client!av", name = "s", descriptor = "Lclient!and;")
	Class3_Sub41_Sub1 aClass3_Sub41_Sub1_2 = new Class3_Sub41_Sub1(15000);

	@OriginalMember(owner = "client!av", name = "y", descriptor = "Lclient!ll;")
	Class301 aClass301_2 = null;

	@OriginalMember(owner = "client!av", name = "b", descriptor = "I")
	int anInt2915 = 0;

	@OriginalMember(owner = "client!av", name = "c", descriptor = "Z")
	boolean aBoolean530 = true;

	@OriginalMember(owner = "client!av", name = "z", descriptor = "I")
	int anInt2918 = 0;

	@OriginalMember(owner = "client!av", name = "j", descriptor = "I")
	public int anInt2919 = 0;

	@OriginalMember(owner = "client!av", name = "t", descriptor = "Z")
	public boolean aBoolean531 = false;

	@OriginalMember(owner = "client!av", name = "w", descriptor = "Lclient!p;")
	Class382 aClass382_1 = new Class382();

	@OriginalMember(owner = "client!av", name = "<init>", descriptor = "()V", line = 37)
	Class82() {
		@Pc(50) Thread local50 = new Thread(this.aClass382_1);
		local50.setDaemon(true);
		local50.setPriority(1);
		local50.start();
	}

	@OriginalMember(owner = "client!av", name = "p", descriptor = "(I)V", line = 45)
	final void method21599() {
		this.aClass553_41.method32701();
		this.anInt2917 = 0;
	}

	@OriginalMember(owner = "client!av", name = "b", descriptor = "()V", line = 45)
	final void method21603() {
		this.aClass553_41.method32701();
		this.anInt2917 = 0;
	}

	@OriginalMember(owner = "client!av", name = "y", descriptor = "()V", line = 45)
	final void method21607() {
		this.aClass553_41.method32701();
		this.anInt2917 = 0;
	}

	@OriginalMember(owner = "client!av", name = "c", descriptor = "()V", line = 45)
	final void method21609() {
		this.aClass553_41.method32701();
		this.anInt2917 = 0;
	}

	@OriginalMember(owner = "client!av", name = "j", descriptor = "()V", line = 50)
	public final void method21608() throws IOException {
		if (this.aClass62_2 == null || this.anInt2917 * 187803349 <= 0) {
			return;
		}
		this.aClass3_Sub41_15.anInt2803 = 0;
		while (true) {
			@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass553_41.method32768();
			if (local17 == null || local17.anInt1295 * 1517097943 > this.aClass3_Sub41_15.aByteArray51.length - this.aClass3_Sub41_15.anInt2803 * 62066237) {
				this.aClass62_2.method12846(this.aClass3_Sub41_15.aByteArray51, 0, this.aClass3_Sub41_15.anInt2803 * 62066237);
				this.anInt2920 += this.aClass3_Sub41_15.anInt2803 * -433165155;
				this.anInt2919 = 0;
				break;
			}
			this.aClass3_Sub41_15.method20248(local17.aClass3_Sub41_Sub1_1.aByteArray51, 0, local17.anInt1295 * 1517097943);
			this.anInt2917 -= local17.anInt1295 * 2120678907;
			local17.method33656();
			local17.aClass3_Sub41_Sub1_1.method20249();
			local17.method11471();
		}
	}

	@OriginalMember(owner = "client!av", name = "n", descriptor = "()V", line = 50)
	public final void method21611() throws IOException {
		if (this.aClass62_2 == null || this.anInt2917 * 187803349 <= 0) {
			return;
		}
		this.aClass3_Sub41_15.anInt2803 = 0;
		while (true) {
			@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass553_41.method32768();
			if (local17 == null || local17.anInt1295 * 1517097943 > this.aClass3_Sub41_15.aByteArray51.length - this.aClass3_Sub41_15.anInt2803 * 62066237) {
				this.aClass62_2.method12846(this.aClass3_Sub41_15.aByteArray51, 0, this.aClass3_Sub41_15.anInt2803 * 62066237);
				this.anInt2920 += this.aClass3_Sub41_15.anInt2803 * -433165155;
				this.anInt2919 = 0;
				break;
			}
			this.aClass3_Sub41_15.method20248(local17.aClass3_Sub41_Sub1_1.aByteArray51, 0, local17.anInt1295 * 1517097943);
			this.anInt2917 -= local17.anInt1295 * 2120678907;
			local17.method33656();
			local17.aClass3_Sub41_Sub1_1.method20249();
			local17.method11471();
		}
	}

	@OriginalMember(owner = "client!av", name = "e", descriptor = "()V", line = 50)
	public final void method21612() throws IOException {
		if (this.aClass62_2 == null || this.anInt2917 * 187803349 <= 0) {
			return;
		}
		this.aClass3_Sub41_15.anInt2803 = 0;
		while (true) {
			@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass553_41.method32768();
			if (local17 == null || local17.anInt1295 * 1517097943 > this.aClass3_Sub41_15.aByteArray51.length - this.aClass3_Sub41_15.anInt2803 * 62066237) {
				this.aClass62_2.method12846(this.aClass3_Sub41_15.aByteArray51, 0, this.aClass3_Sub41_15.anInt2803 * 62066237);
				this.anInt2920 += this.aClass3_Sub41_15.anInt2803 * -433165155;
				this.anInt2919 = 0;
				break;
			}
			this.aClass3_Sub41_15.method20248(local17.aClass3_Sub41_Sub1_1.aByteArray51, 0, local17.anInt1295 * 1517097943);
			this.anInt2917 -= local17.anInt1295 * 2120678907;
			local17.method33656();
			local17.aClass3_Sub41_Sub1_1.method20249();
			local17.method11471();
		}
	}

	@OriginalMember(owner = "client!av", name = "z", descriptor = "()V", line = 50)
	public final void method21614() throws IOException {
		if (this.aClass62_2 == null || this.anInt2917 * 187803349 <= 0) {
			return;
		}
		this.aClass3_Sub41_15.anInt2803 = 0;
		while (true) {
			@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass553_41.method32768();
			if (local17 == null || local17.anInt1295 * 1517097943 > this.aClass3_Sub41_15.aByteArray51.length - this.aClass3_Sub41_15.anInt2803 * 62066237) {
				this.aClass62_2.method12846(this.aClass3_Sub41_15.aByteArray51, 0, this.aClass3_Sub41_15.anInt2803 * 62066237);
				this.anInt2920 += this.aClass3_Sub41_15.anInt2803 * -433165155;
				this.anInt2919 = 0;
				break;
			}
			this.aClass3_Sub41_15.method20248(local17.aClass3_Sub41_Sub1_1.aByteArray51, 0, local17.anInt1295 * 1517097943);
			this.anInt2917 -= local17.anInt1295 * 2120678907;
			local17.method33656();
			local17.aClass3_Sub41_Sub1_1.method20249();
			local17.method11471();
		}
	}

	@OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V", line = 50)
	public final void method21617() throws IOException {
		if (this.aClass62_2 == null || this.anInt2917 * 187803349 <= 0) {
			return;
		}
		this.aClass3_Sub41_15.anInt2803 = 0;
		while (true) {
			@Pc(17) Class3_Sub23 local17 = (Class3_Sub23) this.aClass553_41.method32768();
			if (local17 == null || local17.anInt1295 * 1517097943 > this.aClass3_Sub41_15.aByteArray51.length - this.aClass3_Sub41_15.anInt2803 * 62066237) {
				this.aClass62_2.method12846(this.aClass3_Sub41_15.aByteArray51, 0, this.aClass3_Sub41_15.anInt2803 * 62066237);
				this.anInt2920 += this.aClass3_Sub41_15.anInt2803 * -433165155;
				this.anInt2919 = 0;
				break;
			}
			this.aClass3_Sub41_15.method20248(local17.aClass3_Sub41_Sub1_1.aByteArray51, 0, local17.anInt1295 * 1517097943);
			this.anInt2917 -= local17.anInt1295 * 2120678907;
			local17.method33656();
			local17.aClass3_Sub41_Sub1_1.method20249();
			local17.method11471();
		}
	}

	@OriginalMember(owner = "client!av", name = "g", descriptor = "(Lclient!agh;B)V", line = 69)
	public final void method21601(@OriginalArg(0) Class3_Sub23 arg0) {
		this.aClass553_41.method32702(arg0);
		arg0.anInt1295 = arg0.aClass3_Sub41_Sub1_1.anInt2803 * -1141904373;
		arg0.aClass3_Sub41_Sub1_1.anInt2803 = 0;
		this.anInt2917 += arg0.anInt1295 * 2120678907;
	}

	@OriginalMember(owner = "client!av", name = "d", descriptor = "(Lclient!agh;)V", line = 69)
	public final void method21610(@OriginalArg(0) Class3_Sub23 arg0) {
		this.aClass553_41.method32702(arg0);
		arg0.anInt1295 = arg0.aClass3_Sub41_Sub1_1.anInt2803 * -1141904373;
		arg0.aClass3_Sub41_Sub1_1.anInt2803 = 0;
		this.anInt2917 += arg0.anInt1295 * 2120678907;
	}

	@OriginalMember(owner = "client!av", name = "r", descriptor = "(Lclient!agh;)V", line = 69)
	public final void method21613(@OriginalArg(0) Class3_Sub23 arg0) {
		this.aClass553_41.method32702(arg0);
		arg0.anInt1295 = arg0.aClass3_Sub41_Sub1_1.anInt2803 * -1141904373;
		arg0.aClass3_Sub41_Sub1_1.anInt2803 = 0;
		this.anInt2917 += arg0.anInt1295 * 2120678907;
	}

	@OriginalMember(owner = "client!av", name = "l", descriptor = "(B)V", line = 76)
	void method21602() {
		if (client.anInt3034 % 50 == 0) {
			this.anInt2921 = this.anInt2920 * -1131922425;
			this.anInt2920 = 0;
			this.anInt2922 = this.anInt2923 * 547903431;
			this.anInt2923 = 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "q", descriptor = "()V", line = 76)
	void method21615() {
		if (client.anInt3034 % 50 == 0) {
			this.anInt2921 = this.anInt2920 * -1131922425;
			this.anInt2920 = 0;
			this.anInt2922 = this.anInt2923 * 547903431;
			this.anInt2923 = 0;
		}
	}

	@OriginalMember(owner = "client!av", name = "x", descriptor = "(III)I", line = 77)
	public static int method21623(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		@Pc(1) int local1 = 0;
		while (arg1 > 0) {
			local1 = local1 << 1 | arg0 & 0x1;
			arg0 >>>= 0x1;
			arg1--;
		}
		return local1;
	}

	@OriginalMember(owner = "client!av", name = "v", descriptor = "(Lclient!qg;Ljava/lang/String;)V", line = 85)
	void method21598(@OriginalArg(0) Class62 arg0, @OriginalArg(1) String arg1) {
		this.aClass62_2 = arg0;
		this.aClass382_1.method27314(arg1);
	}

	@OriginalMember(owner = "client!av", name = "h", descriptor = "(Lclient!qg;Ljava/lang/String;I)V", line = 85)
	void method21606(@OriginalArg(0) Class62 arg0, @OriginalArg(1) String arg1) {
		this.aClass62_2 = arg0;
		this.aClass382_1.method27314(arg1);
	}

	@OriginalMember(owner = "client!av", name = "m", descriptor = "(Lclient!qg;Ljava/lang/String;)V", line = 85)
	void method21616(@OriginalArg(0) Class62 arg0, @OriginalArg(1) String arg1) {
		this.aClass62_2 = arg0;
		this.aClass382_1.method27314(arg1);
	}

	@OriginalMember(owner = "client!av", name = "w", descriptor = "()V", line = 90)
	void method21600() {
		if (this.aClass62_2 != null) {
			this.aClass62_2.method12850();
			this.aClass62_2 = null;
		}
		this.aClass382_1.method27314(null);
	}

	@OriginalMember(owner = "client!av", name = "x", descriptor = "(I)V", line = 90)
	void method21604() {
		if (this.aClass62_2 != null) {
			this.aClass62_2.method12850();
			this.aClass62_2 = null;
		}
		this.aClass382_1.method27314(null);
	}

	@OriginalMember(owner = "client!av", name = "t", descriptor = "()V", line = 90)
	void method21618() {
		if (this.aClass62_2 != null) {
			this.aClass62_2.method12850();
			this.aClass62_2 = null;
		}
		this.aClass382_1.method27314(null);
	}

	@OriginalMember(owner = "client!av", name = "s", descriptor = "(I)V", line = 98)
	void method21605() {
		this.aClass62_2 = null;
		this.aClass382_1.method27314(null);
	}

	@OriginalMember(owner = "client!av", name = "o", descriptor = "()V", line = 98)
	void method21620() {
		this.aClass62_2 = null;
		this.aClass382_1.method27314(null);
	}

	@OriginalMember(owner = "client!av", name = "i", descriptor = "()Lclient!qg;", line = 103)
	public Class62 method21619() {
		return this.aClass62_2;
	}

	@OriginalMember(owner = "client!av", name = "u", descriptor = "(I)Lclient!qg;", line = 103)
	public Class62 method21621() {
		return this.aClass62_2;
	}

	@OriginalMember(owner = "client!av", name = "aar", descriptor = "(Lclient!vs;B)V", line = 8741)
	static final void method21624(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(18) int local18 = client.aClass367Array1[local12].method26908();
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local18 == 2 ? 1 : 0;
	}

	@OriginalMember(owner = "client!av", name = "ate", descriptor = "(Lclient!vs;B)V", line = 12415)
	static final void method21622(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub3_1.method14599(local12);
	}
}
