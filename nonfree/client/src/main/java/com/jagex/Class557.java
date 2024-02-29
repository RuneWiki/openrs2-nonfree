package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tm")
public class Class557 {

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "Ljava/util/List;")
	public List aList22 = new LinkedList();

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "Z")
	boolean aBoolean797 = false;

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "I")
	int anInt5268 = 0;

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "I")
	int anInt5269 = 0;

	@OriginalMember(owner = "client!tm", name = "<init>", descriptor = "(Z)V", line = 12)
	Class557(@OriginalArg(0) boolean arg0) {
		this.aBoolean797 = arg0;
	}

	@OriginalMember(owner = "client!tm", name = "v", descriptor = "()V", line = 17)
	public void method31258() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class551 local10 = (Class551) local3.next();
			local3.remove();
			Class337.method27688(local10);
		}
	}

	@OriginalMember(owner = "client!tm", name = "p", descriptor = "(S)V", line = 17)
	public void method31259() {
		@Pc(3) Iterator local3 = this.aList22.iterator();
		while (local3.hasNext()) {
			@Pc(10) Class551 local10 = (Class551) local3.next();
			local3.remove();
			Class337.method27688(local10);
		}
	}

	@OriginalMember(owner = "client!tm", name = "c", descriptor = "(Lclient!te;B)V", line = 26)
	void method31260(@OriginalArg(0) Class551 arg0) {
		@Pc(2) Class104_Sub1 local2 = arg0.aClass104_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class224[] local8 = arg0.aClass104_Sub1_25.aClass224Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean644) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass557_1 = this;
		@Pc(44) Class551 local44;
		if (this.aBoolean797) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class551) local37.next();
				if (local2 == local44.aClass104_Sub1_25) {
					local37.remove();
					Class337.method27688(local44);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class551) local58.next();
		} while (local2.anInt3219 * 621186375 < local44.aClass104_Sub1_25.anInt3219 * 621186375);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "w", descriptor = "(Lclient!te;)V", line = 26)
	void method31261(@OriginalArg(0) Class551 arg0) {
		@Pc(2) Class104_Sub1 local2 = arg0.aClass104_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class224[] local8 = arg0.aClass104_Sub1_25.aClass224Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean644) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass557_1 = this;
		@Pc(44) Class551 local44;
		if (this.aBoolean797) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class551) local37.next();
				if (local2 == local44.aClass104_Sub1_25) {
					local37.remove();
					Class337.method27688(local44);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class551) local58.next();
		} while (local2.anInt3219 * 621186375 < local44.aClass104_Sub1_25.anInt3219 * 621186375);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "l", descriptor = "(Lclient!te;)V", line = 26)
	void method31262(@OriginalArg(0) Class551 arg0) {
		@Pc(2) Class104_Sub1 local2 = arg0.aClass104_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class224[] local8 = arg0.aClass104_Sub1_25.aClass224Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean644) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass557_1 = this;
		@Pc(44) Class551 local44;
		if (this.aBoolean797) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class551) local37.next();
				if (local2 == local44.aClass104_Sub1_25) {
					local37.remove();
					Class337.method27688(local44);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class551) local58.next();
		} while (local2.anInt3219 * 621186375 < local44.aClass104_Sub1_25.anInt3219 * 621186375);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "y", descriptor = "(Lclient!te;)V", line = 26)
	void method31263(@OriginalArg(0) Class551 arg0) {
		@Pc(2) Class104_Sub1 local2 = arg0.aClass104_Sub1_25;
		@Pc(4) boolean local4 = true;
		@Pc(8) Class224[] local8 = arg0.aClass104_Sub1_25.aClass224Array21;
		for (@Pc(10) int local10 = 0; local10 < local8.length; local10++) {
			if (local8[local10].aBoolean644) {
				local4 = false;
				break;
			}
		}
		if (local4) {
			return;
		}
		arg0.aClass557_1 = this;
		@Pc(44) Class551 local44;
		if (this.aBoolean797) {
			@Pc(37) Iterator local37 = this.aList22.iterator();
			while (local37.hasNext()) {
				local44 = (Class551) local37.next();
				if (local2 == local44.aClass104_Sub1_25) {
					local37.remove();
					Class337.method27688(local44);
				}
			}
		}
		@Pc(58) ListIterator local58 = this.aList22.listIterator();
		do {
			if (!local58.hasNext()) {
				this.aList22.add(arg0);
				return;
			}
			local44 = (Class551) local58.next();
		} while (local2.anInt3219 * 621186375 < local44.aClass104_Sub1_25.anInt3219 * 621186375);
		local58.previous();
		local58.add(arg0);
	}

	@OriginalMember(owner = "client!tm", name = "dy", descriptor = "(Lclient!yf;I)V", line = 5065)
	static final void method31264(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class428.method28805(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "nq", descriptor = "(Lclient!yf;B)V", line = 7044)
	static final void method31265(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class26.method464(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!tm", name = "aqy", descriptor = "(Lclient!yf;I)V", line = 12399)
	static final void method31266(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub27_2.method15901();
	}

	@OriginalMember(owner = "client!tm", name = "avx", descriptor = "(Lclient!yf;I)V", line = 13168)
	static final void method31267(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub13_1.method15355() ? 1 : 0;
	}
}
