import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class88 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "d", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!gb;[Lclient!ada;)V")
	public dxVertexLayout(@OriginalArg(0) Class9_Sub3_Sub1 arg0, @OriginalArg(1) Class7[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.aHr1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(17) int local17 = 0;
			@Pc(21) Class7 local21 = arg1[local11];
			for (@Pc(23) int local23 = 0; local21.method214() > local23; local23++) {
				@Pc(37) Class13 local37 = local21.method212(local23);
				@Pc(46) byte local46;
				@Pc(42) byte local42;
				@Pc(44) int local44;
				if (local37 == Static11.aClass13_1) {
					local42 = 0;
					local44 = 0;
					local46 = 2;
				} else if (Static11.aClass13_2 == local37) {
					local44 = 0;
					local46 = 2;
					local42 = 3;
				} else if (local37 == Static11.aClass13_3) {
					local46 = 4;
					local44 = 0;
					local42 = 10;
				} else if (local37 == Static11.aClass13_4) {
					local46 = 0;
					local44 = local9++;
					local42 = 5;
				} else if (local37 == Static11.aClass13_5) {
					local44 = local9++;
					local42 = 5;
					local46 = 1;
				} else if (Static11.aClass13_6 == local37) {
					local44 = local9++;
					local46 = 2;
					local42 = 5;
				} else {
					local44 = local9++;
					local46 = 3;
					local42 = 5;
				}
				local7.addElement(local11, local46, 0, local42, local44, local17);
				local17 += local37.anInt545;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
