package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pw")
public final class Class478 {

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "I")
	static final int anInt5008 = 0;

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "I")
	public static final int anInt5009 = 1;

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "I")
	static final int anInt5010 = 2;

	@OriginalMember(owner = "client!pw", name = "rc", descriptor = "I")
	static int anInt5012;

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "Lclient!ach;")
	static Class57 aClass57_1 = new Class57();

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "Z")
	static boolean aBoolean757 = false;

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "I")
	static int anInt5011 = 0;

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "[Ljava/lang/Object;")
	Object[] anObjectArray43;

	@OriginalMember(owner = "client!pw", name = "v", descriptor = "[[Ljava/lang/Object;")
	Object[][] anObjectArrayArray3;

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "Lclient!pm;")
	Class468 aClass468_2 = null;

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "Lclient!pb;")
	Class126 aClass126_1;

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "Z")
	boolean aBoolean756;

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "I")
	int anInt5007;

	@OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Lclient!pb;ZI)V", line = 24)
	public Class478(@OriginalArg(0) Class126 arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) int arg2) {
		if (arg2 < 0 || arg2 > 2) {
			throw new IllegalArgumentException("");
		}
		this.aClass126_1 = arg0;
		this.aBoolean756 = arg1;
		this.anInt5007 = arg2 * -1094502361;
	}

	@OriginalMember(owner = "client!pw", name = "au", descriptor = "()Z", line = 32)
	synchronized boolean method29712() {
		if (this.aClass468_2 == null) {
			this.aClass468_2 = this.aClass126_1.method11581();
			if (this.aClass468_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass468_2.anInt4986 * -540639821];
			this.anObjectArrayArray3 = new Object[this.aClass468_2.anInt4986 * -540639821][];
		}
		return true;
	}

	@OriginalMember(owner = "client!pw", name = "p", descriptor = "(I)Z", line = 32)
	synchronized boolean method29713() {
		if (this.aClass468_2 == null) {
			this.aClass468_2 = this.aClass126_1.method11581();
			if (this.aClass468_2 == null) {
				return false;
			}
			this.anObjectArray43 = new Object[this.aClass468_2.anInt4986 * -540639821];
			this.anObjectArrayArray3 = new Object[this.aClass468_2.anInt4986 * -540639821][];
		}
		return true;
	}

	@OriginalMember(owner = "client!pw", name = "c", descriptor = "(B)I", line = 42)
	public int method29714() {
		if (!this.method29713()) {
			throw new IllegalStateException("");
		}
		return this.aClass468_2.anInt4983 * -461160727;
	}

	@OriginalMember(owner = "client!pw", name = "ax", descriptor = "()I", line = 42)
	public int method29715() {
		if (!this.method29713()) {
			throw new IllegalStateException("");
		}
		return this.aClass468_2.anInt4983 * -461160727;
	}

	@OriginalMember(owner = "client!pw", name = "ar", descriptor = "()I", line = 42)
	public int method29716() {
		if (!this.method29713()) {
			throw new IllegalStateException("");
		}
		return this.aClass468_2.anInt4983 * -461160727;
	}

	@OriginalMember(owner = "client!pw", name = "ad", descriptor = "()I", line = 42)
	public int method29717() {
		if (!this.method29713()) {
			throw new IllegalStateException("");
		}
		return this.aClass468_2.anInt4983 * -461160727;
	}

	@OriginalMember(owner = "client!pw", name = "v", descriptor = "(IB)Z", line = 47)
	synchronized boolean method29718(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (arg0 >= 0 && arg0 < this.aClass468_2.anIntArray469.length && this.aClass468_2.anIntArray469[arg0] != 0) {
			return true;
		} else if (aBoolean757) {
			throw new IllegalArgumentException(Integer.toString(arg0));
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "l", descriptor = "(III)Z", line = 56)
	public synchronized boolean method29719(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29713()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass468_2.anIntArray469.length && arg1 < this.aClass468_2.anIntArray469[arg0]) {
			return true;
		} else if (aBoolean757) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ac", descriptor = "(II)Z", line = 56)
	public synchronized boolean method29720(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29713()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass468_2.anIntArray469.length && arg1 < this.aClass468_2.anIntArray469[arg0]) {
			return true;
		} else if (aBoolean757) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "av", descriptor = "(II)Z", line = 56)
	public synchronized boolean method29721(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29713()) {
			return false;
		} else if (arg0 >= 0 && arg1 >= 0 && arg0 < this.aClass468_2.anIntArray469.length && arg1 < this.aClass468_2.anIntArray469[arg0]) {
			return true;
		} else if (aBoolean757) {
			throw new IllegalArgumentException(arg0 + " " + arg1);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "y", descriptor = "(II)V", line = 67)
	synchronized void method29722(@OriginalArg(0) int arg0) {
		if (this.aBoolean756) {
			this.anObjectArray43[arg0] = this.aClass126_1.method11569(arg0);
		} else {
			this.anObjectArray43[arg0] = Class29.method498(this.aClass126_1.method11569(arg0), false);
		}
	}

	@OriginalMember(owner = "client!pw", name = "w", descriptor = "(II)V", line = 72)
	public void method29723(@OriginalArg(0) int arg0) {
		this.aClass126_1.method11570(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "at", descriptor = "(I)V", line = 72)
	public void method29724(@OriginalArg(0) int arg0) {
		this.aClass126_1.method11570(arg0);
	}

	@OriginalMember(owner = "client!pw", name = "t", descriptor = "(III)[B", line = 76)
	public byte[] method29725(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		return this.method29726(arg0, arg1, null);
	}

	@OriginalMember(owner = "client!pw", name = "q", descriptor = "(II[II)[B", line = 80)
	public synchronized byte[] method29726(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29719(arg0, arg1)) {
			return null;
		}
		@Pc(9) byte[] local9 = null;
		if (this.anObjectArrayArray3[arg0] == null || this.anObjectArrayArray3[arg0][arg1] == null) {
			@Pc(28) boolean local28 = this.method29759(arg0, arg1, arg2);
			if (!local28) {
				this.method29722(arg0);
				local28 = this.method29759(arg0, arg1, arg2);
				if (!local28) {
					return null;
				}
			}
		}
		if (this.anObjectArrayArray3[arg0] == null) {
			throw new RuntimeException("");
		}
		if (this.anObjectArrayArray3[arg0][arg1] != null) {
			local9 = Class21.method417(this.anObjectArrayArray3[arg0][arg1], false);
			if (local9 == null) {
				throw new RuntimeException("");
			}
		}
		if (local9 != null) {
			if (this.anInt5007 * 1348122519 == 1) {
				this.anObjectArrayArray3[arg0][arg1] = null;
				if (this.aClass468_2.anIntArray469[arg0] == 1) {
					this.anObjectArrayArray3[arg0] = null;
				}
			} else if (this.anInt5007 * 1348122519 == 2) {
				this.anObjectArrayArray3[arg0] = null;
			}
		}
		return local9;
	}

	@OriginalMember(owner = "client!pw", name = "x", descriptor = "(III)Z", line = 117)
	public synchronized boolean method29727(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29719(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ae", descriptor = "(II)Z", line = 117)
	public synchronized boolean method29728(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29719(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ah", descriptor = "(II)Z", line = 117)
	public synchronized boolean method29729(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (!this.method29719(arg0, arg1)) {
			return false;
		} else if (this.anObjectArrayArray3[arg0] != null && this.anObjectArrayArray3[arg0][arg1] != null) {
			return true;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "d", descriptor = "(IB)Z", line = 126)
	public synchronized boolean method29730(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29727(0, arg0);
		} else if (!this.method29718(arg0)) {
			return false;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29727(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "as", descriptor = "(I)Z", line = 126)
	public synchronized boolean method29731(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29727(0, arg0);
		} else if (!this.method29718(arg0)) {
			return false;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29727(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "aq", descriptor = "(I)Z", line = 126)
	public synchronized boolean method29732(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29727(0, arg0);
		} else if (!this.method29718(arg0)) {
			return false;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29727(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "s", descriptor = "(II)Z", line = 134)
	public synchronized boolean method29733(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "af", descriptor = "(I)Z", line = 134)
	public synchronized boolean method29734(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ay", descriptor = "(I)Z", line = 134)
	public synchronized boolean method29735(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "am", descriptor = "(I)Z", line = 134)
	public synchronized boolean method29736(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			this.method29722(arg0);
			return this.anObjectArray43[arg0] != null;
		} else {
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "r", descriptor = "(I)Z", line = 142)
	public synchronized boolean method29737() {
		if (!this.method29713()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass468_2.anIntArray470.length; local9++) {
			@Pc(21) int local21 = this.aClass468_2.anIntArray470[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29722(local21);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pw", name = "an", descriptor = "()Z", line = 142)
	public synchronized boolean method29738() {
		if (!this.method29713()) {
			return false;
		}
		@Pc(7) boolean local7 = true;
		for (@Pc(9) int local9 = 0; local9 < this.aClass468_2.anIntArray470.length; local9++) {
			@Pc(21) int local21 = this.aClass468_2.anIntArray470[local9];
			if (this.anObjectArray43[local21] == null) {
				this.method29722(local21);
				if (this.anObjectArray43[local21] == null) {
					local7 = false;
				}
			}
		}
		return local7;
	}

	@OriginalMember(owner = "client!pw", name = "g", descriptor = "(IS)I", line = 155)
	public synchronized int method29739(@OriginalArg(0) int arg0) {
		if (this.method29718(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass126_1.method11571(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "aa", descriptor = "(I)I", line = 155)
	public synchronized int method29740(@OriginalArg(0) int arg0) {
		if (this.method29718(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass126_1.method11571(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ap", descriptor = "(I)I", line = 155)
	public synchronized int method29741(@OriginalArg(0) int arg0) {
		if (this.method29718(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass126_1.method11571(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ab", descriptor = "(I)I", line = 155)
	public synchronized int method29742(@OriginalArg(0) int arg0) {
		if (this.method29718(arg0)) {
			return this.anObjectArray43[arg0] == null ? this.aClass126_1.method11571(arg0) : 100;
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "z", descriptor = "(I)I", line = 161)
	public synchronized int method29743() {
		if (!this.method29713()) {
			return 0;
		}
		@Pc(7) int local7 = 0;
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < this.anObjectArray43.length; local11++) {
			if (this.aClass468_2.anIntArray465[local11] > 0) {
				local7 += 100;
				local9 += this.method29739(local11);
			}
		}
		if (local7 == 0) {
			return 100;
		} else {
			return local9 * 100 / local7;
		}
	}

	@OriginalMember(owner = "client!pw", name = "aw", descriptor = "(I)[B", line = 176)
	public synchronized byte[] method29744(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return null;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29725(0, arg0);
		} else if (!this.method29718(arg0)) {
			return null;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29725(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "j", descriptor = "(IB)[B", line = 176)
	public synchronized byte[] method29745(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return null;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29725(0, arg0);
		} else if (!this.method29718(arg0)) {
			return null;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29725(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "i", descriptor = "(IB)[I", line = 184)
	public synchronized int[] method29746(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass468_2.anIntArrayArray55[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass468_2.anIntArray465[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pw", name = "az", descriptor = "(I)[I", line = 184)
	public synchronized int[] method29747(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass468_2.anIntArrayArray55[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass468_2.anIntArray465[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pw", name = "bc", descriptor = "(I)[I", line = 184)
	public synchronized int[] method29748(@OriginalArg(0) int arg0) {
		if (!this.method29718(arg0)) {
			return null;
		}
		@Pc(12) int[] local12 = this.aClass468_2.anIntArrayArray55[arg0];
		if (local12 == null) {
			local12 = new int[this.aClass468_2.anIntArray465[arg0]];
			@Pc(23) int local23 = 0;
			while (local23 < local12.length) {
				local12[local23] = local23++;
			}
		}
		return local12;
	}

	@OriginalMember(owner = "client!pw", name = "k", descriptor = "(IB)Z", line = 194)
	public boolean method29749(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29719(0, arg0);
		} else if (!this.method29718(arg0)) {
			return false;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29719(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "bj", descriptor = "(I)Z", line = 194)
	public boolean method29750(@OriginalArg(0) int arg0) {
		if (!this.method29713()) {
			return false;
		} else if (this.aClass468_2.anIntArray469.length == 1) {
			return this.method29719(0, arg0);
		} else if (!this.method29718(arg0)) {
			return false;
		} else if (this.aClass468_2.anIntArray469[arg0] == 1) {
			return this.method29719(arg0, 0);
		} else {
			throw new RuntimeException();
		}
	}

	@OriginalMember(owner = "client!pw", name = "bv", descriptor = "(I)I", line = 202)
	public int method29751(@OriginalArg(0) int arg0) {
		return this.method29718(arg0) ? this.aClass468_2.anIntArray469[arg0] : 0;
	}

	@OriginalMember(owner = "client!pw", name = "u", descriptor = "(IB)I", line = 202)
	public int method29752(@OriginalArg(0) int arg0) {
		return this.method29718(arg0) ? this.aClass468_2.anIntArray469[arg0] : 0;
	}

	@OriginalMember(owner = "client!pw", name = "e", descriptor = "(I)I", line = 207)
	public int method29753() {
		return this.method29713() ? this.aClass468_2.anIntArray469.length : -1;
	}

	@OriginalMember(owner = "client!pw", name = "ba", descriptor = "()I", line = 207)
	public int method29754() {
		return this.method29713() ? this.aClass468_2.anIntArray469.length : -1;
	}

	@OriginalMember(owner = "client!pw", name = "bl", descriptor = "()I", line = 207)
	public int method29755() {
		return this.method29713() ? this.aClass468_2.anIntArray469.length : -1;
	}

	@OriginalMember(owner = "client!pw", name = "f", descriptor = "(II)V", line = 212)
	public synchronized void method29756(@OriginalArg(0) int arg0) {
		if (this.method29718(arg0) && this.anObjectArrayArray3 != null) {
			this.anObjectArrayArray3[arg0] = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "o", descriptor = "(ZZI)V", line = 217)
	public void method29757(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method29713()) {
			return;
		}
		if (arg0) {
			this.aClass468_2.anIntArray466 = null;
			this.aClass468_2.aClass305_1 = null;
		}
		if (arg1) {
			this.aClass468_2.anIntArrayArray56 = null;
			this.aClass468_2.aClass305Array1 = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bb", descriptor = "(ZZ)V", line = 217)
	public void method29758(@OriginalArg(0) boolean arg0, @OriginalArg(1) boolean arg1) {
		if (!this.method29713()) {
			return;
		}
		if (arg0) {
			this.aClass468_2.anIntArray466 = null;
			this.aClass468_2.aClass305_1 = null;
		}
		if (arg1) {
			this.aClass468_2.anIntArrayArray56 = null;
			this.aClass468_2.aClass305Array1 = null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "b", descriptor = "(II[IB)Z", line = 229)
	synchronized boolean method29759(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(20) int local20 = this.aClass468_2.anIntArray465[arg0];
			@Pc(26) int[] local26 = this.aClass468_2.anIntArrayArray55[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass468_2.anIntArray469[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local20; local50++) {
				@Pc(57) int local57;
				if (local26 == null) {
					local57 = local50;
				} else {
					local57 = local26[local50];
				}
				if (local46[local57] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class21.method417(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class21.method417(this.anObjectArray43[arg0], true);
				@Pc(109) Class77_Sub39 local109 = new Class77_Sub39(local104);
				local113 = local109.method22478();
				local117 = local109.method22500();
				@Pc(127) int local127 = (local113 == Class479.aClass479_5.method36479() ? 5 : 9) + local117;
				local109.method22568(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class471.method29624(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw Class392.method28382(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class342.method27780(local104, local104.length) + " " + Class342.method27780(local104, local104.length - 2) + " " + this.aClass468_2.anIntArray467[arg0] + " " + this.aClass468_2.anInt4983 * -461160727);
			}
			if (this.aBoolean756) {
				this.anObjectArray43[arg0] = null;
			}
			if (local20 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class77_Sub39 local244;
				if (this.anInt5007 * 1348122519 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(415) int local415 = 0;
					local254 = 0;
					local244.anInt3089 = local113 * -1387468933;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local20; local316++) {
							local261 += local244.method22500();
							if (local26 == null) {
								local318 = local316;
							} else {
								local318 = local26[local316];
							}
							if (arg1 == local318) {
								local415 += local261;
								local254 = local318;
							}
						}
					}
					if (local415 == 0) {
						return true;
					}
					@Pc(470) byte[] local470 = new byte[local415];
					local415 = 0;
					local244.anInt3089 = local113 * -1387468933;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(488) int local488 = 0; local488 < local20; local488++) {
							local318 += local244.method22500();
							@Pc(502) int local502;
							if (local26 == null) {
								local502 = local488;
							} else {
								local502 = local26[local488];
							}
							if (local502 == arg1) {
								System.arraycopy(local146, local261, local470, local415, local318);
								local415 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local470;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(247) int[] local247 = new int[local20];
					local244.anInt3089 = local113 * -1387468933;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local20; local261++) {
							local259 += local244.method22500();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local20][];
					for (local259 = 0; local259 < local20; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3089 = local113 * -1387468933;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local20; local318++) {
							local316 += local244.method22500();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local20; local261++) {
						if (local26 == null) {
							local316 = local261;
						} else {
							local316 = local26[local261];
						}
						if (this.anInt5007 * 1348122519 == 0) {
							local46[local316] = Class29.method498(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local26 == null) {
					local113 = 0;
				} else {
					local113 = local26[0];
				}
				if (this.anInt5007 * 1348122519 == 0) {
					local46[local113] = Class29.method498(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bx", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method29760(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(20) int local20 = this.aClass468_2.anIntArray465[arg0];
			@Pc(26) int[] local26 = this.aClass468_2.anIntArrayArray55[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass468_2.anIntArray469[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local20; local50++) {
				@Pc(57) int local57;
				if (local26 == null) {
					local57 = local50;
				} else {
					local57 = local26[local50];
				}
				if (local46[local57] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class21.method417(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class21.method417(this.anObjectArray43[arg0], true);
				@Pc(109) Class77_Sub39 local109 = new Class77_Sub39(local104);
				local113 = local109.method22478();
				local117 = local109.method22500();
				@Pc(127) int local127 = (local113 == Class479.aClass479_5.method36479() ? 5 : 9) + local117;
				local109.method22568(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class471.method29624(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw Class392.method28382(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class342.method27780(local104, local104.length) + " " + Class342.method27780(local104, local104.length - 2) + " " + this.aClass468_2.anIntArray467[arg0] + " " + this.aClass468_2.anInt4983 * -461160727);
			}
			if (this.aBoolean756) {
				this.anObjectArray43[arg0] = null;
			}
			if (local20 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class77_Sub39 local244;
				if (this.anInt5007 * 1348122519 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(415) int local415 = 0;
					local254 = 0;
					local244.anInt3089 = local113 * -1387468933;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local20; local316++) {
							local261 += local244.method22500();
							if (local26 == null) {
								local318 = local316;
							} else {
								local318 = local26[local316];
							}
							if (arg1 == local318) {
								local415 += local261;
								local254 = local318;
							}
						}
					}
					if (local415 == 0) {
						return true;
					}
					@Pc(470) byte[] local470 = new byte[local415];
					local415 = 0;
					local244.anInt3089 = local113 * -1387468933;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(488) int local488 = 0; local488 < local20; local488++) {
							local318 += local244.method22500();
							@Pc(502) int local502;
							if (local26 == null) {
								local502 = local488;
							} else {
								local502 = local26[local488];
							}
							if (local502 == arg1) {
								System.arraycopy(local146, local261, local470, local415, local318);
								local415 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local470;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(247) int[] local247 = new int[local20];
					local244.anInt3089 = local113 * -1387468933;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local20; local261++) {
							local259 += local244.method22500();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local20][];
					for (local259 = 0; local259 < local20; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3089 = local113 * -1387468933;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local20; local318++) {
							local316 += local244.method22500();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local20; local261++) {
						if (local26 == null) {
							local316 = local261;
						} else {
							local316 = local26[local261];
						}
						if (this.anInt5007 * 1348122519 == 0) {
							local46[local316] = Class29.method498(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local26 == null) {
					local113 = 0;
				} else {
					local113 = local26[0];
				}
				if (this.anInt5007 * 1348122519 == 0) {
					local46[local113] = Class29.method498(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bd", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method29761(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(20) int local20 = this.aClass468_2.anIntArray465[arg0];
			@Pc(26) int[] local26 = this.aClass468_2.anIntArrayArray55[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass468_2.anIntArray469[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local20; local50++) {
				@Pc(57) int local57;
				if (local26 == null) {
					local57 = local50;
				} else {
					local57 = local26[local50];
				}
				if (local46[local57] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class21.method417(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class21.method417(this.anObjectArray43[arg0], true);
				@Pc(109) Class77_Sub39 local109 = new Class77_Sub39(local104);
				local113 = local109.method22478();
				local117 = local109.method22500();
				@Pc(127) int local127 = (local113 == Class479.aClass479_5.method36479() ? 5 : 9) + local117;
				local109.method22568(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class471.method29624(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw Class392.method28382(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class342.method27780(local104, local104.length) + " " + Class342.method27780(local104, local104.length - 2) + " " + this.aClass468_2.anIntArray467[arg0] + " " + this.aClass468_2.anInt4983 * -461160727);
			}
			if (this.aBoolean756) {
				this.anObjectArray43[arg0] = null;
			}
			if (local20 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class77_Sub39 local244;
				if (this.anInt5007 * 1348122519 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(415) int local415 = 0;
					local254 = 0;
					local244.anInt3089 = local113 * -1387468933;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local20; local316++) {
							local261 += local244.method22500();
							if (local26 == null) {
								local318 = local316;
							} else {
								local318 = local26[local316];
							}
							if (arg1 == local318) {
								local415 += local261;
								local254 = local318;
							}
						}
					}
					if (local415 == 0) {
						return true;
					}
					@Pc(470) byte[] local470 = new byte[local415];
					local415 = 0;
					local244.anInt3089 = local113 * -1387468933;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(488) int local488 = 0; local488 < local20; local488++) {
							local318 += local244.method22500();
							@Pc(502) int local502;
							if (local26 == null) {
								local502 = local488;
							} else {
								local502 = local26[local488];
							}
							if (local502 == arg1) {
								System.arraycopy(local146, local261, local470, local415, local318);
								local415 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local470;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(247) int[] local247 = new int[local20];
					local244.anInt3089 = local113 * -1387468933;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local20; local261++) {
							local259 += local244.method22500();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local20][];
					for (local259 = 0; local259 < local20; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3089 = local113 * -1387468933;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local20; local318++) {
							local316 += local244.method22500();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local20; local261++) {
						if (local26 == null) {
							local316 = local261;
						} else {
							local316 = local26[local261];
						}
						if (this.anInt5007 * 1348122519 == 0) {
							local46[local316] = Class29.method498(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local26 == null) {
					local113 = 0;
				} else {
					local113 = local26[0];
				}
				if (this.anInt5007 * 1348122519 == 0) {
					local46[local113] = Class29.method498(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "by", descriptor = "(II[I)Z", line = 229)
	synchronized boolean method29762(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2) {
		if (!this.method29718(arg0)) {
			return false;
		} else if (this.anObjectArray43[arg0] == null) {
			return false;
		} else {
			@Pc(20) int local20 = this.aClass468_2.anIntArray465[arg0];
			@Pc(26) int[] local26 = this.aClass468_2.anIntArrayArray55[arg0];
			if (this.anObjectArrayArray3[arg0] == null) {
				this.anObjectArrayArray3[arg0] = new Object[this.aClass468_2.anIntArray469[arg0]];
			}
			@Pc(46) Object[] local46 = this.anObjectArrayArray3[arg0];
			@Pc(48) boolean local48 = true;
			for (@Pc(50) int local50 = 0; local50 < local20; local50++) {
				@Pc(57) int local57;
				if (local26 == null) {
					local57 = local50;
				} else {
					local57 = local26[local50];
				}
				if (local46[local57] == null) {
					local48 = false;
					break;
				}
			}
			if (local48) {
				return true;
			}
			@Pc(113) int local113;
			@Pc(117) int local117;
			@Pc(104) byte[] local104;
			if (arg2 == null || arg2[0] == 0 && arg2[1] == 0 && arg2[2] == 0 && arg2[3] == 0) {
				local104 = Class21.method417(this.anObjectArray43[arg0], false);
			} else {
				local104 = Class21.method417(this.anObjectArray43[arg0], true);
				@Pc(109) Class77_Sub39 local109 = new Class77_Sub39(local104);
				local113 = local109.method22478();
				local117 = local109.method22500();
				@Pc(127) int local127 = (local113 == Class479.aClass479_5.method36479() ? 5 : 9) + local117;
				local109.method22568(arg2, 5, local127);
			}
			@Pc(146) byte[] local146;
			try {
				local146 = Class471.method29624(local104);
			} catch (@Pc(148) RuntimeException local148) {
				throw Class392.method28382(local148, (arg2 != null) + " " + arg0 + " " + local104.length + " " + Class342.method27780(local104, local104.length) + " " + Class342.method27780(local104, local104.length - 2) + " " + this.aClass468_2.anIntArray467[arg0] + " " + this.aClass468_2.anInt4983 * -461160727);
			}
			if (this.aBoolean756) {
				this.anObjectArray43[arg0] = null;
			}
			if (local20 > 1) {
				@Pc(254) int local254;
				@Pc(259) int local259;
				@Pc(261) int local261;
				@Pc(316) int local316;
				@Pc(318) int local318;
				@Pc(244) Class77_Sub39 local244;
				if (this.anInt5007 * 1348122519 == 2) {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(415) int local415 = 0;
					local254 = 0;
					local244.anInt3089 = local113 * -1387468933;
					for (local259 = 0; local259 < local117; local259++) {
						local261 = 0;
						for (local316 = 0; local316 < local20; local316++) {
							local261 += local244.method22500();
							if (local26 == null) {
								local318 = local316;
							} else {
								local318 = local26[local316];
							}
							if (arg1 == local318) {
								local415 += local261;
								local254 = local318;
							}
						}
					}
					if (local415 == 0) {
						return true;
					}
					@Pc(470) byte[] local470 = new byte[local415];
					local415 = 0;
					local244.anInt3089 = local113 * -1387468933;
					local261 = 0;
					for (local316 = 0; local316 < local117; local316++) {
						local318 = 0;
						for (@Pc(488) int local488 = 0; local488 < local20; local488++) {
							local318 += local244.method22500();
							@Pc(502) int local502;
							if (local26 == null) {
								local502 = local488;
							} else {
								local502 = local26[local488];
							}
							if (local502 == arg1) {
								System.arraycopy(local146, local261, local470, local415, local318);
								local415 += local318;
							}
							local261 += local318;
						}
					}
					local46[local254] = local470;
				} else {
					local113 = local146.length;
					local113--;
					local117 = local146[local113] & 0xFF;
					local113 -= local117 * local20 * 4;
					local244 = new Class77_Sub39(local146);
					@Pc(247) int[] local247 = new int[local20];
					local244.anInt3089 = local113 * -1387468933;
					for (local254 = 0; local254 < local117; local254++) {
						local259 = 0;
						for (local261 = 0; local261 < local20; local261++) {
							local259 += local244.method22500();
							local247[local261] += local259;
						}
					}
					@Pc(284) byte[][] local284 = new byte[local20][];
					for (local259 = 0; local259 < local20; local259++) {
						local284[local259] = new byte[local247[local259]];
						local247[local259] = 0;
					}
					local244.anInt3089 = local113 * -1387468933;
					local259 = 0;
					for (local261 = 0; local261 < local117; local261++) {
						local316 = 0;
						for (local318 = 0; local318 < local20; local318++) {
							local316 += local244.method22500();
							System.arraycopy(local146, local259, local284[local318], local247[local318], local316);
							local247[local318] += local316;
							local259 += local316;
						}
					}
					for (local261 = 0; local261 < local20; local261++) {
						if (local26 == null) {
							local316 = local261;
						} else {
							local316 = local26[local261];
						}
						if (this.anInt5007 * 1348122519 == 0) {
							local46[local316] = Class29.method498(local284[local261], false);
						} else {
							local46[local316] = local284[local261];
						}
					}
				}
			} else {
				if (local26 == null) {
					local113 = 0;
				} else {
					local113 = local26[0];
				}
				if (this.anInt5007 * 1348122519 == 0) {
					local46[local113] = Class29.method498(local146, false);
				} else {
					local46[local113] = local146;
				}
			}
			return true;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bk", descriptor = "(Lclient!anu;[BIIIILclient!xj;Lclient!xj;B)I", line = 334)
	public static final int method29763(@OriginalArg(0) Class35_Sub12 arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class645 arg6, @OriginalArg(7) Class645 arg7) {
		@Pc(1) int local1 = 0;
		@Pc(6) Class77_Sub39 local6 = new Class77_Sub39(arg1);
		@Pc(8) int local8 = -1;
		label65: while (true) {
			@Pc(12) int local12 = local6.method22545();
			if (local12 == 0) {
				return local1;
			}
			local8 += local12;
			@Pc(22) int local22 = 0;
			@Pc(24) boolean local24 = false;
			while (true) {
				@Pc(30) int local30;
				while (!local24) {
					local30 = local6.method22537();
					if (local30 == 0) {
						continue label65;
					}
					local22 += local30 - 1;
					@Pc(56) int local56 = local22 & 0x3F;
					@Pc(62) int local62 = local22 >> 6 & 0x3F;
					@Pc(68) int local68 = local6.method22478() >> 2;
					@Pc(72) int local72 = local68 & 0x3;
					@Pc(76) int local76 = local68 >> 2;
					@Pc(80) int local80 = local62 + arg2;
					@Pc(84) int local84 = arg3 + local56;
					@Pc(90) Class599 local90 = (Class599) arg0.method18319(local8);
					@Pc(100) int local100;
					@Pc(105) int local105;
					if ((local72 & 0x1) == 0) {
						local100 = local90.anInt5516 * -1082258489;
						local105 = local90.anInt5529 * -1990374967;
					} else {
						local100 = local90.anInt5529 * -1990374967;
						local105 = local90.anInt5516 * -1082258489;
					}
					if (local80 < arg4 && local84 < arg5 && local80 + local100 >= 0 && local105 + local84 >= 0 && (local76 != Class593.aClass593_19.anInt5501 * 847393323 || Class35_Sub6.aClass77_Sub35_45.aClass143_Sub10_1.method15222() != 0 || local90.anInt5518 * -2134171963 != 0 || local90.anInt5527 * -499459421 == 1 || local90.aBoolean821)) {
						if (!local90.method31998(arg7)) {
							arg6.anInt5723 = local8 * 511701673;
							local1++;
						}
						local24 = true;
					}
				}
				local30 = local6.method22537();
				if (local30 == 0) {
					break;
				}
				local6.method22478();
			}
		}
	}

	@OriginalMember(owner = "client!pw", name = "n", descriptor = "(Ljava/lang/String;B)I", line = 365)
	public int method29764(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29718(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bi", descriptor = "(Ljava/lang/String;)I", line = 365)
	public int method29765(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29718(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bw", descriptor = "(Ljava/lang/String;)I", line = 365)
	public int method29766(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29718(local17) ? local17 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pw", name = "a", descriptor = "(II)I", line = 373)
	public int method29767(@OriginalArg(0) int arg0) {
		if (this.method29713()) {
			@Pc(12) int local12 = this.aClass468_2.aClass305_1.method27237(arg0);
			return this.method29718(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bg", descriptor = "(I)I", line = 373)
	public int method29768(@OriginalArg(0) int arg0) {
		if (this.method29713()) {
			@Pc(12) int local12 = this.aClass468_2.aClass305_1.method27237(arg0);
			return this.method29718(local12) ? local12 : -1;
		} else {
			return -1;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bz", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method29769(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "m", descriptor = "(Ljava/lang/String;S)Z", line = 380)
	public boolean method29770(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bs", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method29771(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bt", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method29772(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bu", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method29773(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bf", descriptor = "(Ljava/lang/String;)Z", line = 380)
	public boolean method29774(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return local17 >= 0;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bn", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method29775(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "h", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)Z", line = 388)
	public boolean method29776(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bp", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 388)
	public boolean method29777(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (local20 < 0) {
			return false;
		} else {
			@Pc(35) int local35 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return local35 >= 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "aj", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 399)
	public synchronized byte[] method29778(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return null;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (this.method29718(local20)) {
			@Pc(38) int local38 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return this.method29725(local20, local38);
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ai", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z", line = 409)
	boolean method29779(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (this.method29718(local20)) {
			@Pc(38) int local38 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return this.method29727(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bo", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 409)
	boolean method29780(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (this.method29718(local20)) {
			@Pc(38) int local38 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return this.method29727(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "bm", descriptor = "(Ljava/lang/String;Ljava/lang/String;)Z", line = 409)
	boolean method29781(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1) {
		if (!this.method29713()) {
			return false;
		}
		@Pc(8) String local8 = arg0.toLowerCase();
		@Pc(11) String local11 = arg1.toLowerCase();
		@Pc(20) int local20 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
		if (this.method29718(local20)) {
			@Pc(38) int local38 = this.aClass468_2.aClass305Array1[local20].method27237(Class413.method28610(local11));
			return this.method29727(local20, local38);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "br", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method29782(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29764("");
		return local4 == -1 ? this.method29779(arg0, "") : this.method29779("", arg0);
	}

	@OriginalMember(owner = "client!pw", name = "ag", descriptor = "(Ljava/lang/String;I)Z", line = 419)
	public boolean method29783(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29764("");
		return local4 == -1 ? this.method29779(arg0, "") : this.method29779("", arg0);
	}

	@OriginalMember(owner = "client!pw", name = "bq", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method29784(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29764("");
		return local4 == -1 ? this.method29779(arg0, "") : this.method29779("", arg0);
	}

	@OriginalMember(owner = "client!pw", name = "bk", descriptor = "(Ljava/lang/String;)Z", line = 419)
	public boolean method29785(@OriginalArg(0) String arg0) {
		@Pc(4) int local4 = this.method29764("");
		return local4 == -1 ? this.method29779(arg0, "") : this.method29779("", arg0);
	}

	@OriginalMember(owner = "client!pw", name = "bh", descriptor = "(Ljava/lang/String;)Z", line = 425)
	public boolean method29786(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29733(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "al", descriptor = "(Ljava/lang/String;I)Z", line = 425)
	public boolean method29787(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29733(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "be", descriptor = "(Ljava/lang/String;)Z", line = 425)
	public boolean method29788(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29733(local17);
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ao", descriptor = "(Ljava/lang/String;I)I", line = 432)
	public int method29789(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cg", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method29790(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cb", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method29791(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cc", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method29792(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cf", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method29793(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cl", descriptor = "(Ljava/lang/String;)I", line = 432)
	public int method29794(@OriginalArg(0) String arg0) {
		if (this.method29713()) {
			@Pc(8) String local8 = arg0.toLowerCase();
			@Pc(17) int local17 = this.aClass468_2.aClass305_1.method27237(Class413.method28610(local8));
			return this.method29739(local17);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cp", descriptor = "([B)[B", line = 439)
	static final byte[] method29795(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(9) Class472 local9 = new Class472(local4);
		@Pc(13) Class479 local13 = local9.method29626();
		@Pc(17) int local17 = local9.method29629();
		if (local17 < 0 || anInt5011 * 852448745 != 0 && local17 > anInt5011 * 852448745) {
			throw new RuntimeException();
		} else if (local13 == Class479.aClass479_5) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method22533(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29634();
			if (local50 < 0 || anInt5011 * 852448745 != 0 && local50 > anInt5011 * 852448745) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (local13 == Class479.aClass479_4) {
				local72 = new byte[local50];
				Class702.method36499(local72, local50, arg0, local17, 9);
			} else if (local13 == Class479.aClass479_2) {
				local72 = new byte[local50];
				@Pc(89) Class57 local89 = aClass57_1;
				synchronized (aClass57_1) {
					aClass57_1.method861(local4, local72);
				}
			} else if (Class479.aClass479_3 == local13) {
				try {
					local72 = Class662.method33095(local4, local50);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pw", name = "cw", descriptor = "([B)[B", line = 439)
	static final byte[] method29796(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(9) Class472 local9 = new Class472(local4);
		@Pc(13) Class479 local13 = local9.method29626();
		@Pc(17) int local17 = local9.method29629();
		if (local17 < 0 || anInt5011 * 852448745 != 0 && local17 > anInt5011 * 852448745) {
			throw new RuntimeException();
		} else if (local13 == Class479.aClass479_5) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method22533(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29634();
			if (local50 < 0 || anInt5011 * 852448745 != 0 && local50 > anInt5011 * 852448745) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (local13 == Class479.aClass479_4) {
				local72 = new byte[local50];
				Class702.method36499(local72, local50, arg0, local17, 9);
			} else if (local13 == Class479.aClass479_2) {
				local72 = new byte[local50];
				@Pc(89) Class57 local89 = aClass57_1;
				synchronized (aClass57_1) {
					aClass57_1.method861(local4, local72);
				}
			} else if (Class479.aClass479_3 == local13) {
				try {
					local72 = Class662.method33095(local4, local50);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}

	@OriginalMember(owner = "client!pw", name = "ck", descriptor = "([B)[B", line = 439)
	static final byte[] method29797(@OriginalArg(0) byte[] arg0) {
		@Pc(4) Class77_Sub39 local4 = new Class77_Sub39(arg0);
		@Pc(9) Class472 local9 = new Class472(local4);
		@Pc(13) Class479 local13 = local9.method29626();
		@Pc(17) int local17 = local9.method29629();
		if (local17 < 0 || anInt5011 * 852448745 != 0 && local17 > anInt5011 * 852448745) {
			throw new RuntimeException();
		} else if (local13 == Class479.aClass479_5) {
			@Pc(38) byte[] local38 = new byte[local17];
			local4.method22533(local38, 0, local17);
			return local38;
		} else {
			@Pc(50) int local50 = local9.method29634();
			if (local50 < 0 || anInt5011 * 852448745 != 0 && local50 > anInt5011 * 852448745) {
				throw new RuntimeException();
			}
			@Pc(72) byte[] local72;
			if (local13 == Class479.aClass479_4) {
				local72 = new byte[local50];
				Class702.method36499(local72, local50, arg0, local17, 9);
			} else if (local13 == Class479.aClass479_2) {
				local72 = new byte[local50];
				@Pc(89) Class57 local89 = aClass57_1;
				synchronized (aClass57_1) {
					aClass57_1.method861(local4, local72);
				}
			} else if (Class479.aClass479_3 == local13) {
				try {
					local72 = Class662.method33095(local4, local50);
				} catch (@Pc(114) IOException local114) {
					throw new RuntimeException(local114);
				}
			} else {
				throw new RuntimeException();
			}
			return local72;
		}
	}
}
