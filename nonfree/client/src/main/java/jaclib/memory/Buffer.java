package jaclib.memory;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaclib/memory/Buffer")
public interface Buffer {

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "p", descriptor = "()I")
	int p();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "c", descriptor = "()J")
	long c();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "v", descriptor = "([BIII)V")
	void v(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "l", descriptor = "([BIII)V")
	void l(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "y", descriptor = "([BIII)V")
	void y(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "w", descriptor = "([BIII)V")
	void w(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "t", descriptor = "([BIII)V")
	void t(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3);

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "q", descriptor = "()I")
	int q();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "x", descriptor = "()I")
	int x();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "d", descriptor = "()J")
	long d();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "s", descriptor = "()J")
	long s();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "r", descriptor = "()J")
	long r();

	@OriginalMember(owner = "client!jaclib/memory/Buffer", name = "g", descriptor = "()J")
	long g();
}
