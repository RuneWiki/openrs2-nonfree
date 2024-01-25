import jagdx.IDirect3DVertexDeclaration;
import jagdx.VertexElementCollection;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dxVertexLayout")
public final class dxVertexLayout extends Class142 {

	@OriginalMember(owner = "client!dxVertexLayout", name = "f", descriptor = "Lclient!jagdx/IDirect3DVertexDeclaration;")
	public final IDirect3DVertexDeclaration anIDirect3DVertexDeclaration1;

	@OriginalMember(owner = "client!dxVertexLayout", name = "<init>", descriptor = "(Lclient!mba;[Lclient!ed;)V")
	public dxVertexLayout(@OriginalArg(0) Class15_Sub2_Sub2 arg0, @OriginalArg(1) Class78[] arg1) {
		@Pc(7) VertexElementCollection local7 = new VertexElementCollection(arg0.anAaa1);
		@Pc(9) int local9 = 0;
		for (@Pc(11) int local11 = 0; local11 < arg1.length; local11++) {
			@Pc(21) int local21 = 0;
			@Pc(25) Class78 local25 = arg1[local11];
			for (@Pc(27) int local27 = 0; local25.method2278() > local27; local27++) {
				@Pc(37) Class164 local37 = local25.method2280(local27);
				@Pc(52) byte local52;
				@Pc(50) byte local50;
				@Pc(48) int local48;
				if (local37 == Static231.aClass164_1) {
					local52 = 2;
					local48 = 0;
					local50 = 0;
				} else if (local37 == Static231.aClass164_2) {
					local50 = 3;
					local52 = 2;
					local48 = 0;
				} else if (local37 == Static231.aClass164_3) {
					local48 = 0;
					local50 = 10;
					local52 = 4;
				} else if (Static231.aClass164_4 == local37) {
					local52 = 0;
					local48 = local9++;
					local50 = 5;
				} else if (local37 == Static231.aClass164_5) {
					local50 = 5;
					local52 = 1;
					local48 = local9++;
				} else if (Static231.aClass164_6 == local37) {
					local48 = local9++;
					local52 = 2;
					local50 = 5;
				} else {
					local48 = local9++;
					local50 = 5;
					local52 = 3;
				}
				local7.addElement(local11, local52, 0, local50, local48, local21);
				local21 += local37.anInt4714;
			}
		}
		local7.finish();
		this.anIDirect3DVertexDeclaration1 = arg0.anIDirect3DDevice1.a(local7, null);
	}
}
