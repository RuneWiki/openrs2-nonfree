import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class331 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!hb;[Lclient!qp;)V")
	public dxVertexLayout(@OriginalArg(0) Class12_Sub2_Sub1 arg0, @OriginalArg(1) Class271[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anOw1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class271 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local27 < local25.method6330(); local27++) {
				@Pc(37) Class193 local37 = local25.method6329(local27);
				@Pc(42) byte local42;
				@Pc(44) byte local44;
				@Pc(46) int local46;
				if (Static278.aClass193_1 == local37) {
					local42 = 2;
					local44 = 0;
					local46 = 0;
				} else if (local37 == Static278.aClass193_2) {
					local46 = 0;
					local42 = 2;
					local44 = 3;
				} else if (Static278.aClass193_3 == local37) {
					local44 = 10;
					local46 = 0;
					local42 = 4;
				} else if (Static278.aClass193_4 == local37) {
					local46 = local9++;
					local42 = 0;
					local44 = 5;
				} else if (local37 == Static278.aClass193_5) {
					local46 = local9++;
					local42 = 1;
					local44 = 5;
				} else if (Static278.aClass193_6 == local37) {
					local42 = 2;
					local44 = 5;
					local46 = local9++;
				} else {
					local44 = 5;
					local42 = 3;
					local46 = local9++;
				}
				local7.addElement(local11, local42, 0, local44, local46, local21);
				local21 += local37.anInt5102;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
